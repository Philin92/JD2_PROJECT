package io.swagger.services.interfaces;

import io.swagger.model.Customer;

import java.io.Serializable;

public interface CustomerService
        extends BaseHibernateService<Customer, Serializable> {

    Customer patch(long id, Customer patchEntity);
}
