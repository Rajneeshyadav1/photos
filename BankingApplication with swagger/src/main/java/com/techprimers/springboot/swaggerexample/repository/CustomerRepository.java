package com.techprimers.springboot.swaggerexample.repository;

import com.techprimers.springboot.swaggerexample.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByName(String name);


}

