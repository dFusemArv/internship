package com.suman.internship.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.internship.models.MedicineType;
import com.suman.internship.repositories.MedicineTypeRepository;

@Service
public class MedicineTypeService {
	@Autowired
	private MedicineTypeRepository medicineTypeRepository;
	
	//Return list of countries
	public List<MedicineType> getMedicineTypes(){
		return medicineTypeRepository.findAll();
	}
	
	//SAve new MedicineType
	public void save(MedicineType medicineType) {
		medicineTypeRepository.save(medicineType);
	}
	
	//get by id
	public Optional<MedicineType> findById(int id) {
		return medicineTypeRepository.findById(id);
	}

	public void delete(Integer id) {
		medicineTypeRepository.deleteById(id);
	}
}
