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
import com.suman.internship.models.Medicine;
import com.suman.internship.services.MedicineService;

@Controller
public class MedicineController {
	@Autowired  private MedicineService medicineService;

	@GetMapping("/medicine")
	public String getStates(Model model) {		
		
		//List<State> stateList = stateService.getStates();	
		List<Country> countryList = countryService.getCountries();
		List<Medicine> medicineList = medicineService.getMedicines();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("medicines", medicineList);	
		//model.addAttribute("states", stateList);
		return "medicine";
	}	
	
	@PostMapping("/medicines/addNew")
	public String addNew(Medicine medicine) {
		medicineService.save(medicine);
		return "redirect:/medicine";
	}
	
	@RequestMapping("medicines/findById")
	@ResponseBody
	public Optional<Medicine> findById(int id) {
	  return medicineService.findById(id);	
	}	
	
	@RequestMapping(value="/medicines/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Medicine medicine) {
		medicineService.save(medicine);
		return "redirect:/medicine";
	}
	
	@RequestMapping(value="/medicines/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		medicineService.delete(id);
		return "redirect:/medicine";
	}}
