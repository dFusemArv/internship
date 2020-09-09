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
import com.suman.internship.models.MedicineType;
import com.suman.internship.services.MedicineTypeService;

@Controller
public class MedicineTypeController {
	@Autowired  private MedicineTypeService medicineTypeService;

	@GetMapping("/medicineType")
	public String getStates(Model model) {		
		
		//List<State> stateList = stateService.getStates();	
		List<Country> countryList = countryService.getCountries();
		List<MedicineType> medicineTypeList = medicineTypeService.getMedicineTypes();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("medicineTypes", medicineTypeList);	
		//model.addAttribute("states", stateList);
		return "medicineType";
	}	
	
	@PostMapping("/medicineTypes/addNew")
	public String addNew(MedicineType medicineType) {
		medicineTypeService.save(medicineType);
		return "redirect:/medicineType";
	}
	
	@RequestMapping("medicineTypes/findById")
	@ResponseBody
	public Optional<MedicineType> findById(int id) {
	  return medicineTypeService.findById(id);	
	}	
	
	@RequestMapping(value="/medicineTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(MedicineType medicineType) {
		medicineTypeService.save(medicineType);
		return "redirect:/medicineType";
	}
	
	@RequestMapping(value="/medicineTypes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		medicineTypeService.delete(id);
		return "redirect:/medicineType";
	}
}
