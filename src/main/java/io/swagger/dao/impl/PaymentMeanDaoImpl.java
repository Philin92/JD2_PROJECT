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
        if(href==null){entity.setHref(patchHref);}
        else if(patchHref!=null && !href.equals(patchHref)){
            entity.setHref(patchHref);
        }

        String name = entity.getName();
        String patchName = patchEntity.getName();
        if(name==null){entity.setName(patchName);}
        else if(patchName!=null && !name.equals(patchName)){
            entity.setName(patchName);
        }

        ValidFor validFor = entity.getValidFor();
        ValidFor patchValidFor = patchEntity.getValidFor();
        if(validFor==null){entity.setValidFor(patchValidFor);}
        else if(patchValidFor!=null && !validFor.equals(patchValidFor)){
            entity.setValidFor(patchValidFor);
        }

        String type = entity.getType();
        String patchType = patchEntity.getType();
        if(type==null){entity.setType(patchType);}
        else if(patchType!=null && !type.equals(patchType)){
            entity.setType(patchType);
        }

        BankAccount bankAccount = entity.getBankAccount();
        BankAccount patchBankAccount = patchEntity.getBankAccount();
        if(bankAccount==null){entity.setBankAccount(patchBankAccount);}
        else if(patchBankAccount!=null && !bankAccount.equals(patchBankAccount)){
            entity.setBankAccount(patchBankAccount);
        }

        Reference reference = entity.getRelatedParty();
        Reference patchReference = patchEntity.getRelatedParty();
        if(reference==null){entity.setRelatedParty(patchReference);}
        else if(patchReference!=null && !reference.equals(patchReference)){
            entity.setRelatedParty(patchReference);
        }

        CreditCard creditCard = entity.getCreditCard();
        CreditCard patchCreditCard = patchEntity.getCreditCard();
        if(creditCard==null){entity.setCreditCard(patchCreditCard);}
        else if(patchCreditCard!=null && !creditCard.equals(patchCreditCard)){
            entity.setCreditCard(patchCreditCard);
        }

        return entity;
    }
}
