package io.swagger.services.impl;

import io.swagger.dao.impl.CustomerDaoImpl;
import io.swagger.dao.interfaces.BaseHibernateDao;
import io.swagger.dao.interfaces.CustomerDao;
import io.swagger.model.Customer;
import io.swagger.services.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
@Transactional
public class CustomerServiceImpl
        extends BaseHibernateServiceImpl<Customer, Serializable>
        implements CustomerService {

    private CustomerDaoImpl customerDao;

    @Autowired
    CustomerServiceImpl(BaseHibernateDao<Customer,Serializable> dao){
        super(dao);
        this.customerDao = (CustomerDaoImpl) dao;
    }
}
