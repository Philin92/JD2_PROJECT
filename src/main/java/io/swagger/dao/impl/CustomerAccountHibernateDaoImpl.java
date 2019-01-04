package io.swagger.dao.impl;

import io.swagger.dao.interfaces.CustomerAccountDao;
import io.swagger.model.CustomerAccount;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.logging.Logger;

@Repository
public class CustomerAccountHibernateDaoImpl extends BaseHibernateDaoImpl<CustomerAccount, Serializable> implements CustomerAccountDao {

    CustomerAccountHibernateDaoImpl(SessionFactory sessionFactory) {
        super(CustomerAccount.class);
        this.sessionFactory = sessionFactory;
    }

    private static Logger log = Logger.getLogger(CustomerAccountHibernateDaoImpl.class.getName());

    @Override
    public CustomerAccount update(Serializable id, CustomerAccount entity) {
        log.info("Call update(): ");
        entity.setId((Long) id);
        saveOrUpdate(entity);

        return entity;
    }
}
