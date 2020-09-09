package com.suman.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.internship.models.Invoice;



@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

}
