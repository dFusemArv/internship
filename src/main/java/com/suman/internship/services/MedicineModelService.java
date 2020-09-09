package com.suman.internship.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.internship.models.MedicineModel;
import com.suman.internship.repositories.MedicineModelRepository;

@Service
public class MedicineModelService {
	@Autowired
	private MedicineModelRepository medicineModelRepository;
	
	//Return list of countries
	public List<MedicineModel> getMedicineModels(){
		return medicineModelRepository.findAll();
	}
	
	//SAve new MedicineModel
	public void save(MedicineModel medicineModel) {
		medicineModelRepository.save(medicineModel);
	}
	
	//get by id
	public Optional<MedicineModel> findById(int id) {
		return medicineModelRepository.findById(id);
	}

	public void delete(Integer id) {
		medicineModelRepository.deleteById(id);
	}
}
