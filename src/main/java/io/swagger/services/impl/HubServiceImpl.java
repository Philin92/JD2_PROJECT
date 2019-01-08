package io.swagger.services.impl;

import io.swagger.dao.impl.HubDaoImpl;
import io.swagger.dao.interfaces.BaseHibernateDao;
import io.swagger.model.Hub;
import io.swagger.services.interfaces.HubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
@Transactional
public class HubServiceImpl
        extends BaseHibernateServiceImpl<Hub, Serializable>
        implements HubService {

    private HubDaoImpl hubDao;

    @Autowired
    public HubServiceImpl(BaseHibernateDao<Hub, Serializable> dao){
        super(dao);
        this.hubDao = (HubDaoImpl) dao;
    }
}
