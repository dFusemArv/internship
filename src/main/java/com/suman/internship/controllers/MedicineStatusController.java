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
import com.suman.internship.models.MedicineStatus;
import com.suman.internship.services.MedicineStatusService;

@Controller
public class MedicineStatusController {
	@Autowired  private MedicineStatusService medicineStatusService;

	@GetMapping("/medicineStatus")
	public String getStates(Model model) {		
		
		//List<State> stateList = stateService.getStates();	
		List<Country> countryList = countryService.getCountries();
		List<MedicineStatus> medicineStatusList = medicineStatusService.getMedicineStatuss();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("medicineStatuss", medicineStatusList);	
		//model.addAttribute("states", stateList);
		return "medicineStatus";
	}	
	
	@PostMapping("/medicineStatuss/addNew")
	public String addNew(MedicineStatus medicineStatus) {
		medicineStatusService.save(medicineStatus);
		return "redirect:/medicineStatus";
	}
	
	@RequestMapping("medicineStatuss/findById")
	@ResponseBody
	public Optional<MedicineStatus> findById(int id) {
	  return medicineStatusService.findById(id);	
	}	
	
	@RequestMapping(value="/medicineStatuss/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(MedicineStatus medicineStatus) {
		medicineStatusService.save(medicineStatus);
		return "redirect:/medicineStatus";
	}
	
	@RequestMapping(value="/medicineStatuss/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		medicineStatusService.delete(id);
		return "redirect:/medicineStatus";
	}
}
