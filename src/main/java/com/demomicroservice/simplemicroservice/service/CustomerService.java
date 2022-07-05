package com.demomicroservice.simplemicroservice.service;

import com.demomicroservice.simplemicroservice.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id, String name);
    CustomerDTO getCustomer(int id);
}
