package com.suman.internship.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.internship.models.Country;
import com.suman.internship.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	//save new country
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	public Optional<Country> findById(Integer id) {
		return countryRepository.findById(id);
	}
	


	public void delete(Integer id) {
		// TODO Auto-generated method stub
		countryRepository.deleteById(id);
	}
}
