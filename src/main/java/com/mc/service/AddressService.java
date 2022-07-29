package com.mc.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mc.model.Address;

public interface AddressService extends MongoRepository<Address, String>{

}
