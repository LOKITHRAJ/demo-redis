package com.incubator.demoredis;

import com.incubator.demoredis.domain.Customer;
import com.incubator.demoredis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable String id) {
        return customerService.getCustomerById(id);
    }
}
