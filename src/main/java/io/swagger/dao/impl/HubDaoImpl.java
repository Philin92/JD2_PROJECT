package io.swagger.dao.impl;

import io.swagger.dao.interfaces.HubDao;
import io.swagger.model.Hub;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class HubDaoImpl extends BaseHibernateDaoImpl<Hub, Serializable> implements HubDao {

    public HubDaoImpl(SessionFactory sessionFactory){
        super(Hub.class);
        this.sessionFactory = sessionFactory;
    }
}
