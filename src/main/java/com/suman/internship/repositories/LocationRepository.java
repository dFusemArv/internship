package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
