package com.suman.internship.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.internship.models.State;
import com.suman.internship.repositories.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	
	public List<State> getStates(){
		return stateRepository.findAll();
	}
	
	//save new state
	public void save(State state) {
		stateRepository.save(state);
	}
	
	public Optional<State> findById(Integer id) {
		return stateRepository.findById(id);
	}
	


	public void delete(Integer id) {
		// TODO Auto-generated method stub
		stateRepository.deleteById(id);
	}
}
