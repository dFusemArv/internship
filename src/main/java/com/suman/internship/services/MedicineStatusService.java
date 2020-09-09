package com.suman.internship.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.internship.models.MedicineStatus;
import com.suman.internship.repositories.MedicineStatusRepository;

@Service
public class MedicineStatusService {
	@Autowired
	private MedicineStatusRepository medicineStatusRepository;
	
	//Return list of countries
	public List<MedicineStatus> getMedicineStatuss(){
		return medicineStatusRepository.findAll();
	}
	
	//SAve new MedicineStatus
	public void save(MedicineStatus medicineStatus) {
		medicineStatusRepository.save(medicineStatus);
	}
	
	//get by id
	public Optional<MedicineStatus> findById(int id) {
		return medicineStatusRepository.findById(id);
	}

	public void delete(Integer id) {
		medicineStatusRepository.deleteById(id);
	}
}
