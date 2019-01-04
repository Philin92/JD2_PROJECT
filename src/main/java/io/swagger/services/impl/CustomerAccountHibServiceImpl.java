package io.swagger.services.impl;

import io.swagger.dao.impl.CustomerAccountHibernateDaoImpl;
import io.swagger.dao.interfaces.BaseHibernateDao;
import io.swagger.dao.interfaces.CustomerAccountDao;
import io.swagger.model.CustomerAccount;
import io.swagger.services.interfaces.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
@Transactional
public class CustomerAccountHibServiceImpl
        extends BaseHibernateServiceImpl<CustomerAccount, Serializable>
        implements CustomerAccountService {

    private CustomerAccountHibernateDaoImpl cutomerAccountDao;

    @Autowired
    public CustomerAccountHibServiceImpl(BaseHibernateDao<CustomerAccount,Serializable> dao){
        super(dao);
        this.cutomerAccountDao = (CustomerAccountHibernateDaoImpl) dao;
    }

}
