package com.techprimers.springboot.swaggerexample.controller;


import java.util.List;

import com.techprimers.springboot.swaggerexample.model.Customer;
import com.techprimers.springboot.swaggerexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

//    @PostMapping("/addCustomers")
//    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
//        return service.saveCustomers(customers);
//    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers() {
        return service.getCustomers();
    }

//    @GetMapping("/customerById/{id}")
//    public Customer findCustomerById(@PathVariable int id) {
//        return service.getCustomerById(id);
//    }

    @GetMapping("/customer/{name}")
    public Customer findCustomerByName(@PathVariable String name) {
        return service.getCustomerByName(name);
    }

    /*
     * @PutMapping("/update") public Product updateProduct(@RequestBody Product
     * product) { return service.updateProduct(product); }
     */

//    @DeleteMapping("/delete/{id}")
//    public String deleteCustomer(@PathVariable int id) {
//        return service.deleteCustomer(id);
//    }
}
