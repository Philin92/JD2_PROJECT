package io.swagger.dao.impl;

import io.swagger.dao.interfaces.PaymentMeanDao;
import io.swagger.model.PaymentMean;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class PaymentMeanDaoImpl
        extends BaseHibernateDaoImpl<PaymentMean, Serializable> implements PaymentMeanDao {

    public PaymentMeanDaoImpl(SessionFactory sessionFactory){
        super(PaymentMean.class);
        this.sessionFactory = sessionFactory;
    }
}
