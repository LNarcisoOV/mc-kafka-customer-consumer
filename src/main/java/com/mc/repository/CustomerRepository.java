package com.mc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mc.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
