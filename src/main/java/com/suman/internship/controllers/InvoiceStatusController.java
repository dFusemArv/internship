package com.suman.internship.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suman.internship.models.Country;
import com.suman.internship.models.InvoiceStatus;
import com.suman.internship.services.InvoiceStatusService;

@Controller
public class InvoiceStatusController {
	@Autowired  private InvoiceStatusService invoiceStatusService;

	@GetMapping("/invoiceStatus")
	public String getStates(Model model) {		
		
		//List<State> stateList = stateService.getStates();	
		List<Country> countryList = countryService.getCountries();
		List<InvoiceStatus> invoiceStatusList = invoiceStatusService.getInvoiceStatuss();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("invoiceStatuss", invoiceStatusList);	
		//model.addAttribute("states", stateList);
		return "invoiceStatus";
	}	
	
	@PostMapping("/invoiceStatuses/addNew")
	public String addNew(InvoiceStatus invoiceStatus) {
		invoiceStatusService.save(invoiceStatus);
		return "redirect:/invoiceStatus";
	}
	
	@RequestMapping("invoiceStatuses/findById")
	@ResponseBody
	public Optional<InvoiceStatus> findById(int id) {
	  return invoiceStatusService.findById(id);	
	}	
	
	@RequestMapping(value="/invoiceStatuses/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(InvoiceStatus invoiceStatus) {
		invoiceStatusService.save(invoiceStatus);
		return "redirect:/invoiceStatus";
	}
	
	@RequestMapping(value="/invoiceStatuses/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		invoiceStatusService.delete(id);
		return "redirect:/invoiceStatus";
	}}
