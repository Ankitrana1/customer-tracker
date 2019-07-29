package com.ankit.tracker.dao;

import com.ankit.tracker.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ICustomerDAO {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);
}
