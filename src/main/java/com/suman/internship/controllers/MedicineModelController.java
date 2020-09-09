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
import com.suman.internship.models.MedicineModel;
import com.suman.internship.services.MedicineModelService;

@Controller
public class MedicineModelController {
	@Autowired  private MedicineModelService medicineModelService;

	@GetMapping("/medicineModel")
	public String getStates(Model model) {		
		
		//List<State> stateList = stateService.getStates();	
		List<Country> countryList = countryService.getCountries();
		List<MedicineModel> medicineModelList = medicineModelService.getMedicineModels();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("medicineModels", medicineModelList);	
		//model.addAttribute("states", stateList);
		return "medicineModel";
	}	
	
	@PostMapping("/medicineModels/addNew")
	public String addNew(MedicineModel medicineModel) {
		medicineModelService.save(medicineModel);
		return "redirect:/medicineModel";
	}
	
	@RequestMapping("medicineModels/findById")
	@ResponseBody
	public Optional<MedicineModel> findById(int id) {
	  return medicineModelService.findById(id);	
	}	
	
	@RequestMapping(value="/medicineModels/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(MedicineModel medicineModel) {
		medicineModelService.save(medicineModel);
		return "redirect:/medicineModel";
	}
	
	@RequestMapping(value="/medicineModels/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		medicineModelService.delete(id);
		return "redirect:/medicineModel";
	}
}
