package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
