package com.mc.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.mc.util.Constants;

@Service
public class KafkaCustomerConsumerServiceImpl {

    @KafkaListener(topics= {Constants.CUSTOMER_TOPIC_NAME})
    public void customerConsumer(String payload) {
        payload.toString();
    }
    
    @KafkaListener(topics= {Constants.ADDRESS_TOPIC_NAME})
    public void addressConsumer(String payload) {
        payload.toString();
    }
}
