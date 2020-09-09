package com.suman.internship.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.internship.models.MedicineMake;
import com.suman.internship.repositories.MedicineMakeRepository;

@Service
public class MedicineMakeService {
	@Autowired
	private MedicineMakeRepository medicineMakeRepository;
	
	//Return list of countries
	public List<MedicineMake> getMedicineMakes(){
		return medicineMakeRepository.findAll();
	}
	
	//SAve new MedicineMake
	public void save(MedicineMake medicineMake) {
		medicineMakeRepository.save(medicineMake);
	}
	
	//get by id
	public Optional<MedicineMake> findById(int id) {
		return medicineMakeRepository.findById(id);
	}

	public void delete(Integer id) {
		medicineMakeRepository.deleteById(id);
	}
}
