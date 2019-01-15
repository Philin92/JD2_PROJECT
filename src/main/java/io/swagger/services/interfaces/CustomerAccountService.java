package io.swagger.services.interfaces;

import io.swagger.model.CustomerAccount;

import java.io.Serializable;

public interface CustomerAccountService
        extends BaseHibernateService<CustomerAccount, Serializable> {

    CustomerAccount patch(long id, CustomerAccount entity);
}
