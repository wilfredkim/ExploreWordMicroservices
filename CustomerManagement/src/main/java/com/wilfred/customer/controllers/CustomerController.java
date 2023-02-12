package com.wilfred.customer.controllers;

import com.wilfred.customer.models.Customer;
import com.wilfred.customer.payloads.CustomerRequest;
import com.wilfred.customer.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/customers")
@Slf4j
@AllArgsConstructor
public class CustomerController {
    private  final  CustomerService customerService;
    @PostMapping
    void registerCustomer(@RequestBody CustomerRequest customerRequest) {
        log.info("Customers Registration {}" + customerRequest);
        customerService.registerCustomer(customerRequest);
    }
}
