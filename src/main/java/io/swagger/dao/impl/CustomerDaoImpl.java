package io.swagger.dao.impl;

import io.swagger.dao.interfaces.CustomerDao;
import io.swagger.model.Customer;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class CustomerDaoImpl extends BaseHibernateDaoImpl<Customer, Serializable> implements CustomerDao {

    public CustomerDaoImpl(SessionFactory sessionFactory){
        super(Customer.class);
        this.sessionFactory = sessionFactory;
    }
}
