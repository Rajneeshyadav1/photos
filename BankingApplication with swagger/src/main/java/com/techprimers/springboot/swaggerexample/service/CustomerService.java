package com.techprimers.springboot.swaggerexample.service;


import com.techprimers.springboot.swaggerexample.model.Customer;
import com.techprimers.springboot.swaggerexample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }
//
//    public List<Customer> saveCustomers(List<Customer> customers) {
//        return repository.saveAll(customers);
//    }

    public List<Customer> getCustomers() {
        return repository.findAll();
    }

//    public Customer getCustomerById(int id) {
//        return repository.findById(id).orElse(null);
//    }

    public Customer getCustomerByName(String name) {
        return repository.findByName(name);
    }

//   public String deleteCustomer(int id) {
//      repository.deleteById(id);
//     return "product removed ... " + id;
//  }

//    public List<Customer> saveCustomers(List<Customer> customers) {
//        return repository.saveAll(customers);
//    }


    /*
     * public Product updateProduct(Product product) { Product existingProduct =
     * repository.findById(product.getId()).orElse(null);
     * existingProduct.setName(product.getName());
     * existingProduct.setQuantity(product.getQuantity());
     * existingProduct.setPrice(product.getPrice()); return
     * repository.save(existingProduct); }
     */


}
