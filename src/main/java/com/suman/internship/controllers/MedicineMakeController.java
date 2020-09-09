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
import com.suman.internship.models.MedicineMake;
import com.suman.internship.services.MedicineMakeService;

@Controller
public class MedicineMakeController {
	@Autowired  private MedicineMakeService medicineMakeService;

	@GetMapping("/medicineMake")
	public String getStates(Model model) {		
		
		//List<State> stateList = stateService.getStates();	
		List<Country> countryList = countryService.getCountries();
		List<MedicineMake> medicineMakeList = medicineMakeService.getMedicineMakes();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("medicineMakes", medicineMakeList);	
		//model.addAttribute("states", stateList);
		return "medicineMake";
	}	
	
	@PostMapping("/medicineMakes/addNew")
	public String addNew(MedicineMake medicineMake) {
		medicineMakeService.save(medicineMake);
		return "redirect:/medicineMake";
	}
	
	@RequestMapping("medicineMakes/findById")
	@ResponseBody
	public Optional<MedicineMake> findById(int id) {
	  return medicineMakeService.findById(id);	
	}	
	
	@RequestMapping(value="/medicineMakes/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(MedicineMake medicineMake) {
		medicineMakeService.save(medicineMake);
		return "redirect:/medicineMake";
	}
	
	@RequestMapping(value="/medicineMakes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		medicineMakeService.delete(id);
		return "redirect:/medicineMake";
	}
}
