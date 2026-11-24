package com.example.customerservice.repository;

import com.example.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public class CustomerRepository extends JpaRepository<Customer, Long> {
}
