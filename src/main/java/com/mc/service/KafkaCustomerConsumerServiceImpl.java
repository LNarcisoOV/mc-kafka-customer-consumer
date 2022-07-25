package com.mc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.mc.util.Constants;

@Service
public class KafkaCustomerConsumerServiceImpl {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaCustomerConsumerServiceImpl.class);

    @KafkaListener(topics= {Constants.CUSTOMER_TOPIC_NAME}, groupId = "groupId")
    public void customerConsumer(String payload) {
        LOGGER.info("----- KAFKA CUSTOMER CONSUMER: {} -----", payload);
        payload.toString();
    }
    
    @KafkaListener(topics= {Constants.ADDRESS_TOPIC_NAME}, groupId = "groupId")
    public void addressConsumer(String payload) {
        LOGGER.info("----- KAFKA ADDRESS CONSUMER: {} -----", payload);
        payload.toString();
    }
}
