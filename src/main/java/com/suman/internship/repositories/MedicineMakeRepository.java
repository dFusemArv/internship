package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.MedicineMake;

@Repository
public interface MedicineMakeRepository extends JpaRepository<MedicineMake, Integer> {

}
