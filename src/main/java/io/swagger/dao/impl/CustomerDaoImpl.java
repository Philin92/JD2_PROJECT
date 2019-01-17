package io.swagger.dao.impl;

import io.swagger.dao.interfaces.CustomerDao;
import io.swagger.model.*;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class CustomerDaoImpl extends BaseHibernateDaoImpl<Customer, Serializable> implements CustomerDao {

    public CustomerDaoImpl(SessionFactory sessionFactory){
        super(Customer.class);
        this.sessionFactory = sessionFactory;
    }

    private static Logger log = Logger.getLogger(CustomerDaoImpl.class.getName());

    public Customer patch(Serializable id, Customer patchEntity){

        log.info("Call patch: ");

        Customer entity = getById(id);

        String href = entity.getHref();
        String patchHref = patchEntity.getHref();
        if(patchHref != null && !href.equals(patchHref)){
            entity.setHref(patchHref);
        }

        String name = entity.getName();
        String patchName = patchEntity.getName();
        if(patchName != null && !name.equals(patchName)){
            entity.setName(patchName);
        }

        String status = entity.getStatus();
        String patchStatus = patchEntity.getStatus();
        if(patchStatus != null && !status.equals(patchStatus)){
            entity.setStatus(patchStatus);
        }

        String description = entity.getDescription();
        String patchDescription = patchEntity.getDescription();
        if(patchDescription != null && !description.equals(patchDescription)){
            entity.setDescription(patchDescription);
        }

        ValidFor validFor = entity.getValidFor();
        ValidFor patchValidFor = patchEntity.getValidFor();
        if(patchValidFor != null && !validFor.equals(patchValidFor)){
            entity.setValidFor(patchValidFor);
        }

        String customerRank = entity.getCustomerRank();
        String patchCustomerRank = patchEntity.getCustomerRank();
        if(patchCustomerRank != null && !customerRank.equals(patchCustomerRank)){
            entity.setCustomerRank(patchCustomerRank);
        }

        Reference reference = entity.getRelatedParty();
        Reference patchReference = patchEntity.getRelatedParty();
        if(patchReference != null && !reference.equals(patchReference)){
            entity.setRelatedParty(patchReference);
        }

        List<Characteristic> characteristics = entity.getCharacteristic();
        List<Characteristic> patchCharacteristics = patchEntity.getCharacteristic();
        if(patchCharacteristics != null && !patchCharacteristics.equals(characteristics)) {
            for(Characteristic c: patchCharacteristics){
                if(!characteristics.contains(c)){
                    characteristics.add(c);
                }
            }
        }

        List<ContactMedium> contactMedia = entity.getContactMedium();
        List<ContactMedium> patchContactMedia = patchEntity.getContactMedium();
        if(patchContactMedia != null && !patchContactMedia.equals(contactMedia)) {
            for(ContactMedium c: patchContactMedia){
                if(!contactMedia.contains(c)){
                    contactMedia.add(c);
                }
            }
        }

        List<CustomerAccount> customerAccounts = entity.getCustomerAccount();
        List<CustomerAccount> patchCustomerAccounts = patchEntity.getCustomerAccount();
        if(patchCustomerAccounts != null && !patchCustomerAccounts.equals(customerAccounts)) {
            for(CustomerAccount c: patchCustomerAccounts){
                if(!customerAccounts.contains(c)){
                    customerAccounts.add(c);
                }
            }
        }

        List<CustomerCreditProfile> profiles = entity.getCustomerCreditProfile();
        List<CustomerCreditProfile> patchProfiles = patchEntity.getCustomerCreditProfile();
        if(patchProfiles != null && !patchProfiles.equals(profiles)) {
            for(CustomerCreditProfile c: patchProfiles){
                if(!profiles.contains(c)){
                    profiles.add(c);
                }
            }
        }

        List<PaymentMean> paymentMeans = entity.getPaymentMean();
        List<PaymentMean> patchPaymentMeans = patchEntity.getPaymentMean();
        if(patchPaymentMeans != null && !patchPaymentMeans.equals(paymentMeans)) {
            for(PaymentMean p: patchPaymentMeans){
                if(!paymentMeans.contains(p)){
                    paymentMeans.add(p);
                }
            }
        }

        saveOrUpdate(entity);

        return entity;
    }
}
