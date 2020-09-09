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
import com.suman.internship.models.JobTitle;
import com.suman.internship.services.JobTitleService;

@Controller
public class JobTitleController {
	@Autowired  private JobTitleService jobTitleService;

	@GetMapping("/jobTitle")
	public String getStates(Model model) {		
		
		//List<State> stateList = stateService.getStates();	
		List<Country> countryList = countryService.getCountries();
		List<JobTitle> jobTitleList = jobTitleService.getJobTitles();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("jobTitles", jobTitleList);	
		//model.addAttribute("states", stateList);
		return "jobTitle";
	}	
	
	@PostMapping("/jobTitles/addNew")
	public String addNew(JobTitle jobTitle) {
		jobTitleService.save(jobTitle);
		return "redirect:/jobTitle";
	}
	
	@RequestMapping("jobTitles/findById")
	@ResponseBody
	public Optional<JobTitle> findById(int id) {
	  return jobTitleService.findById(id);	
	}	
	
	@RequestMapping(value="/jobTitles/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(JobTitle jobTitle) {
		jobTitleService.save(jobTitle);
		return "redirect:/jobTitle";
	}
	
	@RequestMapping(value="/jobTitles/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		jobTitleService.delete(id);
		return "redirect:/jobTitle";
	}
}
