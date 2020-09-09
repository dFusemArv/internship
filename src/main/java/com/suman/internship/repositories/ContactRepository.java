package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
