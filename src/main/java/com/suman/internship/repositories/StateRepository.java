package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
