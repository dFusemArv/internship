package com.suman.internship.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.internship.models.Medicine;
import com.suman.internship.repositories.MedicineRepository;

@Service
public class MedicineService {
	@Autowired
	private MedicineRepository medicineRepository;
	
	//Return list of countries
	public List<Medicine> getMedicines(){
		return medicineRepository.findAll();
	}
	
	//SAve new Medicine
	public void save(Medicine medicine) {
		medicineRepository.save(medicine);
	}
	
	//get by id
	public Optional<Medicine> findById(int id) {
		return medicineRepository.findById(id);
	}

	public void delete(Integer id) {
		medicineRepository.deleteById(id);
	}
}
