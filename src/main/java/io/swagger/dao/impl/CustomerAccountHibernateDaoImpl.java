package io.swagger.dao.impl;

import io.swagger.dao.interfaces.CustomerAccountDao;
import io.swagger.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

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

        Session session = openSession();

        CustomerAccount entity = session.find(CustomerAccount.class,id);

        /*List<CustomerAccountTaxExemption> taxExemptions = entity.getCustomerAccountTaxExemption();
        if(taxExemptions!=null) {
            for(CustomerAccountTaxExemption c:taxExemptions){
                session.delete(c);
            }
        }

        List<CustomerAccountRelationship> relationships = entity.getCustomerAccountRelationship();
        if(relationships!=null){
            for(CustomerAccountRelationship c:relationships){
                session.delete(c);
            }
        }

        List<Contact> contacts = entity.getContact();
        if(contacts!=null){
            for(Contact c: contacts) {
                session.delete(c);
            }
        }

        List<CustomerAccountBalance> balances = entity.getCustomerAccountBalance();
        if(balances!=null){
            for(CustomerAccountBalance c: balances) {
                session.delete(c);
            }
        }

        List<PaymentPlan> plans = entity.getPaymentPlan();
        if(plans!=null){
            for(PaymentPlan p: plans) {
                session.delete(p);
            }
        }*/

        BeanUtils.copyProperties(updateEntity,entity);

        saveOrUpdate(entity);

        return entity;
    }
}
