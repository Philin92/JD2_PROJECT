package io.swagger.dao.impl;

import io.swagger.dao.interfaces.CustomerAccountDao;
import io.swagger.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import org.threeten.bp.OffsetDateTime;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class CustomerAccountHibernateDaoImpl extends BaseHibernateDaoImpl<CustomerAccount, Serializable> implements CustomerAccountDao {

    CustomerAccountHibernateDaoImpl(SessionFactory sessionFactory) {
        super(CustomerAccount.class);
        this.sessionFactory = sessionFactory;
    }

    private static Logger log = Logger.getLogger(CustomerAccountHibernateDaoImpl.class.getName());

    @Override
    public CustomerAccount update(Serializable id, CustomerAccount updateEntity) {

        log.info("Call update(): ");

        CustomerAccount entity = openSession().find(CustomerAccount.class,id);
        BeanUtils.copyProperties(updateEntity,entity);

        saveOrUpdate(entity);

        return entity;
    }

    public CustomerAccount patch(Serializable id, CustomerAccount patchEntity){

        log.info("Call patch: ");

        CustomerAccount entity = getById(id);

        String href = entity.getHref();// 1.PARAMETER HREF
        String patchHref = patchEntity.getHref();
        if(patchHref != null && !href.equals(patchHref)){
            entity.setHref(patchHref);
        }

        String name = entity.getName();// 2.PARAMETER NAME
        String patchName = patchEntity.getName();
        if(patchName != null && !name.equals(patchName)){
            entity.setName(patchName);
        }

        String description = entity.getDescription();// 3.PARAMETER DESCRIPTION
        String patchDescription = patchEntity.getDescription();
        if(patchDescription != null && !description.equals(patchDescription)){
            entity.setDescription(patchDescription);
        }

        String status = entity.getStatus();// 4.PARAMETER STATUS
        String patchStatus = patchEntity.getStatus();
        if(patchStatus != null && !status.equals(patchStatus)){
            entity.setStatus(patchStatus);
        }

        String accountType = entity.getAccountType();// 5.PARAMETER ACCOUNT_TYPE
        String patchAccountType = patchEntity.getAccountType();
        if(patchAccountType != null && !accountType.equals(patchAccountType)){
            entity.setAccountType(patchAccountType);
        }

        String creditLimit = entity.getCreditLimit();// 6.PARAMETER CREDIT_LIMIT
        String patchCreditLimit = patchEntity.getCreditLimit();
        if(patchCreditLimit != null && !creditLimit.equals(patchCreditLimit)){
            entity.setCreditLimit(patchCreditLimit);
        }

        String pin = entity.getPin();// 7.PARAMETER PIN
        String patchPin = patchEntity.getPin();
        if(patchPin != null && !pin.equals(patchPin)){
            entity.setPin(patchPin);
        }

        Float receivableBalance = entity.getReceivableBalance();// 8.PARAMETER RECEIVABLE_BALANCE
        Float patchReceivableBalance = patchEntity.getReceivableBalance();
        if(patchReceivableBalance != null && !receivableBalance.equals(patchReceivableBalance)){
            entity.setReceivableBalance(patchReceivableBalance);
        }

        List<CustomerAccountTaxExemption> taxExemptionList = entity.getCustomerAccountTaxExemption();
        List<CustomerAccountTaxExemption> patchTaxExemptionList = patchEntity.getCustomerAccountTaxExemption();
        if(patchTaxExemptionList != null && !patchTaxExemptionList.equals(taxExemptionList)) {
            for(CustomerAccountTaxExemption c: patchTaxExemptionList){
                if(!taxExemptionList.contains(c)){// 9.PARAMETER CUSTOMER_ACCOUNT_TAX_EXEMPTION
                    taxExemptionList.add(c);
                }
            }
        }

        List<CustomerAccountRelationship> relationshipList = entity.getCustomerAccountRelationship();
        List<CustomerAccountRelationship> patchRelationshipList = patchEntity.getCustomerAccountRelationship();
        if(patchRelationshipList != null && !patchRelationshipList.equals(relationshipList)) {
            for(CustomerAccountRelationship c: patchRelationshipList){// 10.PARAMETER CUSTOMER_ACCOUNT_RELATIONSHIP
                if(!relationshipList.contains(c)){
                    relationshipList.add(c);
                }
            }
        }

        List<Contact> contactList = entity.getContact();
        List<Contact> patchContactList = patchEntity.getContact();
        if(patchContactList != null && !patchContactList.equals(contactList)) {
            for(Contact c: patchContactList){// 11.PARAMETER CONTACT
                if(!contactList.contains(c)){
                    contactList.add(c);
                }
            }
        }

        CustomerRef entityCustomerRef = entity.getCustomerRef();
        CustomerRef patchCustomerRef = patchEntity.getCustomerRef();
        if(patchCustomerRef != null && !patchCustomerRef.equals(entityCustomerRef)) {
            entity.setCustomerRef(patchCustomerRef); // 12.PARAMETER CUSTOMER_REF
        }

        List<CustomerAccountBalance> accountBalances = entity.getCustomerAccountBalance();
        List<CustomerAccountBalance> patchAccountBalances = patchEntity.getCustomerAccountBalance();
        if(patchAccountBalances != null && !patchAccountBalances.equals(accountBalances)) {
            for(CustomerAccountBalance c: patchAccountBalances){// 13.PARAMETER CUSTOMER_ACCOUNT_BALANCE
                if(!accountBalances.contains(c)){
                    accountBalances.add(c);
                }
            }
        }

        List<PaymentPlan> paymentPlans = entity.getPaymentPlan();
        List<PaymentPlan> patchPaymentPlans = patchEntity.getPaymentPlan();
        if(patchPaymentPlans != null && !patchPaymentPlans.equals(paymentPlans)) {
            for(PaymentPlan p: patchPaymentPlans){// 14.PARAMETER PAYMENT_PLAN
                if(!paymentPlans.contains(p)){
                    paymentPlans.add(p);
                }
            }
        }

        OffsetDateTime entityLastModified = entity.getLastModified();
        OffsetDateTime patchLastModified = patchEntity.getLastModified();
        if(patchLastModified != null && !patchLastModified.equals(entityLastModified)) {
            entity.setLastModified(patchLastModified); // 15.PARAMETER lastModified
        }

        saveOrUpdate(entity);

        return entity;

    }
}
