package com.mc.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mc.model.Customer;

public interface CustomerService extends MongoRepository<Customer, String>{

}
