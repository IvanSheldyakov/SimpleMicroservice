package com.demomicroservice.simplemicroservice.service.impl;

import com.demomicroservice.simplemicroservice.model.CustomerDTO;
import com.demomicroservice.simplemicroservice.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceInMemoryImpl implements CustomerService {

    private Map<Integer,CustomerDTO> customers = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        customers.put(id,new CustomerDTO(id,name));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return customers.get(id);
    }
}
