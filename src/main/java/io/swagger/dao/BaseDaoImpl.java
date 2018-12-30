package io.swagger.dao;

import io.swagger.model.CustomerAccount;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;


public abstract class BaseDaoImpl<T> {

    @Autowired
    SessionFactory sessionFactory;

    public abstract List<T> find();

    public abstract void deleteById(Serializable id);

    public abstract T getById(Serializable id);

    public boolean add(List<T> items){
        return false;
    }

    Session openSession(){
        return sessionFactory.getCurrentSession();
    }
}
