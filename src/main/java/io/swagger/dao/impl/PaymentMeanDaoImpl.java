package io.swagger.dao.impl;

import io.swagger.dao.interfaces.PaymentMeanDao;
import io.swagger.model.*;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.logging.Logger;

@Repository
public class PaymentMeanDaoImpl
        extends BaseHibernateDaoImpl<PaymentMean, Serializable> implements PaymentMeanDao {

    public PaymentMeanDaoImpl(SessionFactory sessionFactory){
        super(PaymentMean.class);
        this.sessionFactory = sessionFactory;
    }

    private static Logger log = Logger.getLogger(PaymentMeanDaoImpl.class.getName());

    public PaymentMean patch(long id, PaymentMean patchEntity){

        log.info("Call patch: ");

        PaymentMean entity = getById(id);

        String href = entity.getHref();
        String patchHref = patchEntity.getHref();
        if(patchHref!=null && !href.equals(patchHref)){
            entity.setHref(patchHref);
        }

        String name = entity.getName();
        String patchName = patchEntity.getName();
        if(patchName!=null && !name.equals(patchName)){
            entity.setName(patchName);
        }

        ValidFor validFor = entity.getValidFor();
        ValidFor patchValidFor = patchEntity.getValidFor();
        if(patchValidFor!=null && !validFor.equals(patchValidFor)){
            entity.setValidFor(patchValidFor);
        }

        String type = entity.getType();
        String patchType = patchEntity.getType();
        if(patchType!=null && !type.equals(patchType)){
            entity.setType(patchType);
        }

        BankAccount bankAccount = entity.getBankAccount();
        BankAccount patchBankAccount = patchEntity.getBankAccount();
        if(patchBankAccount!=null && !bankAccount.equals(patchBankAccount)){
            entity.setBankAccount(patchBankAccount);
        }

        Reference reference = entity.getRelatedParty();
        Reference patchReference = patchEntity.getRelatedParty();
        if(patchReference!=null && !reference.equals(patchReference)){
            entity.setRelatedParty(patchReference);
        }

        CreditCard creditCard = entity.getCreditCard();
        CreditCard patchCreditCard = patchEntity.getCreditCard();
        if(patchCreditCard!=null && !creditCard.equals(patchCreditCard)){
            entity.setCreditCard(patchCreditCard);
        }

        return entity;
    }
}
