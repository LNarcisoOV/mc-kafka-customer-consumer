package com.mc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mc.model.Address;

public interface AddressRepository extends MongoRepository<Address, String>{

}
