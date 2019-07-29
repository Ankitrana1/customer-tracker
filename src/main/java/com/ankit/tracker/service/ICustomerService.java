package com.ankit.tracker.service;

import com.ankit.tracker.entity.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);
}
