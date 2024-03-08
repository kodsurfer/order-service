package org.example.orderservice.services;

import org.example.orderservice.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> GetCustomers() {
        return new ArrayList<Customer>();
    }
}
