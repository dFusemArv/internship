package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.MedicineStatus;

@Repository
public interface MedicineStatusRepository extends JpaRepository<MedicineStatus, Integer> {

}
