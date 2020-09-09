package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

}
