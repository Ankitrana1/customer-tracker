package com.ankit.tracker.dao;

import com.ankit.tracker.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAO implements ICustomerDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("from Customer",Customer.class);
        List<Customer> customers = query.getResultList();
        return customers;
    }

    public void saveCustomer(Customer customer){
        Session session = sessionFactory.getCurrentSession() ;
        //saveOrUpdate - save if customer is new
        session.saveOrUpdate(customer);
    }

    public Customer getCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);
        return customer;
    }

    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Customer where id=: customerId ");
        query.setParameter("customerId",id);
        query.executeUpdate();
    }
}
