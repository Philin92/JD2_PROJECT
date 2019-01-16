package io.swagger.services.impl;

import io.swagger.dao.impl.PaymentMeanDaoImpl;
import io.swagger.dao.interfaces.BaseHibernateDao;
import io.swagger.model.PaymentMean;
import io.swagger.services.interfaces.PaymentMeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
@Transactional
public class PaymentMeanServiceImpl
        extends BaseHibernateServiceImpl<PaymentMean, Serializable>
        implements PaymentMeanService {

    private PaymentMeanDaoImpl paymentMeanDao;

    @Autowired
    public PaymentMeanServiceImpl(BaseHibernateDao<PaymentMean,Serializable> dao){
        super(dao);
        this.paymentMeanDao = (PaymentMeanDaoImpl) dao;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public PaymentMean patch(long id, PaymentMean patchEntity) {
        return paymentMeanDao.patch(id,patchEntity);
    }
}
