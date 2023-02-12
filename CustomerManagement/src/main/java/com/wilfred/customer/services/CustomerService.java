package com.wilfred.customer.services;

import com.wilfred.customer.models.Customer;
import com.wilfred.customer.payloads.CustomerRequest;
import com.wilfred.customer.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {

    public Customer registerCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .emailAddress(customerRequest.email())
                .build();
        return customerRepository.save(customer);

    }
}
