package io.swagger.services.interfaces;

import io.swagger.model.PaymentMean;

import java.io.Serializable;

public interface PaymentMeanService
        extends BaseHibernateService<PaymentMean, Serializable> {

    PaymentMean patch(long id, PaymentMean patchEntity);
}
