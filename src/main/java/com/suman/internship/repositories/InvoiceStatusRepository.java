package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.InvoiceStatus;



@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer>{

}
