package com.mc;

import java.util.List;
import org.springframework.data.annotation.Id;

public class CustomerAddress {

    @Id
    private Long customerId;

    private String customer;

    private List<String> addresses;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }



}
