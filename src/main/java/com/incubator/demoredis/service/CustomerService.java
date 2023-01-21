package com.incubator.demoredis.service;

import com.incubator.demoredis.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "customer")
public class CustomerService {

    private static Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Cacheable(key="#id")
    public Customer getCustomerById(String id) {
        log.info("Getting Customer info for id {}", id);
        return new Customer("User"+id, "test"+id+"@gmail.com", id);
    }
}
