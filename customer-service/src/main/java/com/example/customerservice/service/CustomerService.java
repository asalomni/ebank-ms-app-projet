package com.example.customerservice.service;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerRepository(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public Customer findCustomerById(Long id){
        return customerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Customer Not Found"));
    }
    public Customer saveCustomer(Customer customer){
        return CustomerRepository.save(customer);
    }
}

