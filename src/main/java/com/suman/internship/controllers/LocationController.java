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
import com.suman.internship.models.Location;
import com.suman.internship.services.CountryService;
import com.suman.internship.services.LocationService;
import com.suman.internship.services.StateService;

@Controller
public class LocationController {
	@Autowired	private StateService stateService;
	@Autowired	private CountryService countryService;
	@Autowired  private LocationService locationService;

	@GetMapping("/location")
	public String getStates(Model model) {		
		
		//List<State> stateList = stateService.getStates();	
		List<Country> countryList = countryService.getCountries();
		List<Location> locationList = locationService.getLocations();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("locations", locationList);	
		//model.addAttribute("states", stateList);
		return "location";
	}	
	
	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/location";
	}
	
	@RequestMapping("locations/findById")
	@ResponseBody
	public Optional<Location> findById(int id) {
	  return locationService.findById(id);	
	}	
	
	@RequestMapping(value="/locations/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/location";
	}
	
	@RequestMapping(value="/locations/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		locationService.delete(id);
		return "redirect:/location";
	}
}
