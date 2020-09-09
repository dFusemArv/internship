package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
