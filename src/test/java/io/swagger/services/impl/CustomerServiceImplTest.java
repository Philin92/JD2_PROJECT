package io.swagger.services.impl;

import io.swagger.configuration.HibernateXMLConfTest;
import io.swagger.model.*;
import io.swagger.services.interfaces.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class CustomerServiceImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    CustomerService objUnderTest;

    private static Customer customer(String prefix){

        Customer customer = new Customer();

        customer.setHref("href: "+prefix);
        customer.setName("name: "+prefix);
        customer.setStatus("status: "+prefix);
        customer.setDescription("description: "+prefix);
        customer.setCustomerRank("customerRank: "+prefix);

        Reference reference = new Reference();
        reference.setName("refName: "+prefix);
        reference.setRole("refRole: "+prefix);
        reference.setHref("refHref: "+prefix);

        customer.setRelatedParty(reference);

        ArrayList<Characteristic> characteristics = new ArrayList<>();
        characteristics.add(characteristic("_"+prefix+"_1"));
        characteristics.add(characteristic("_"+prefix+"_2"));
        characteristics.add(characteristic("_"+prefix+"_3"));

        customer.setCharacteristic(characteristics);

        ArrayList<ContactMedium> contactMedia = new ArrayList<>();
        contactMedia.add(contactMedium("_"+prefix+"_1"));
        contactMedia.add(contactMedium("_"+prefix+"_2"));
        contactMedia.add(contactMedium("_"+prefix+"_3"));

        customer.setContactMedium(contactMedia);

        ArrayList<CustomerAccount> customerAccounts = new ArrayList<>();
        customerAccounts.add(customerAccount("_"+prefix+"_1"));
        customerAccounts.add(customerAccount("_"+prefix+"_2"));
        customerAccounts.add(customerAccount("_"+prefix+"_3"));

        customer.setCustomerAccount(customerAccounts);

        CustomerCreditProfile customerCreditProfile = new CustomerCreditProfile();
        customerCreditProfile.setCreditRiskRating("CreditRiskRating: "+prefix);
        customerCreditProfile.setCreditScore("CreditRiskRating: "+prefix);

        customer.setCustomerCreditProfile(List.of(customerCreditProfile));

        ArrayList<PaymentMean> paymentMeans = new ArrayList<>();
        paymentMeans.add(paymentMean("_"+prefix+"_1"));
        paymentMeans.add(paymentMean("_"+prefix+"_2"));
        paymentMeans.add(paymentMean("_"+prefix+"_3"));

        customer.setPaymentMean(paymentMeans);

        return customer;
    }

    private static Characteristic characteristic(String prefix){

        Characteristic characteristic = new Characteristic();

        characteristic.setName("charName: "+prefix);
        characteristic.setValue("charValue: "+prefix);

        return characteristic;
    }

    private static ContactMedium contactMedium(String prefix){

        ContactMedium contactMedium = new ContactMedium();

        contactMedium.setType("contactType: "+prefix);
        contactMedium.setPreferred("contactPref: "+prefix);

        Medium medium = new Medium();
        medium.setCity("city: "+prefix);
        medium.setCountry("country: "+prefix);
        medium.setEmailAddress("email: "+prefix);
        medium.setPostcode("postcode: "+prefix);

        contactMedium.setMedium(medium);

        return contactMedium;
    }

    private static CustomerAccount customerAccount(String prefix){
        CustomerAccount customerAccount = new CustomerAccount();

        customerAccount.setStatus("CaStatus: "+prefix);
        customerAccount.setPin("CaPin: "+prefix);
        customerAccount.setReceivableBalance((float) 2.3);
        customerAccount.setCreditLimit("CaCreditLimit: "+prefix);
        customerAccount.setName("CaName: "+prefix);

        return customerAccount;
    }

    private static PaymentMean paymentMean(String prefix){
        PaymentMean paymentMean = new PaymentMean();

        paymentMean.setName("PmName: "+prefix);
        paymentMean.setType("PmType: "+prefix);
        paymentMean.setHref("PmHref: "+prefix);

        return paymentMean;
    }

    @Test
    public void saveListDeleteCustomer(){
        Customer customer = customer("1");
        objUnderTest.saveOrUpdate(customer);

        Serializable id = customer.getId();
        assertNotNull(id);

        assertEquals(customer.getCustomerRank(),"customerRank: 1");
        assertEquals(customer.getName(),"name: 1");
        assertEquals(customer.getRelatedParty().getName(),"refName: 1");
        assertEquals(customer.getCharacteristic().get(0).getName(),"charName: _1_1");

        List<Customer> customerList = objUnderTest.findList();
        assertTrue(customerList.size()==1);

        objUnderTest.deleteById(id);
    }

    @Test
    public void saveUpdateDeleteCustomer(){
        Customer customer = customer("1");
        objUnderTest.saveOrUpdate(customer);

        Serializable id = customer.getId();
        assertNotNull(id);

        Customer customerUpdate = customer("update");
        customerUpdate.setId((Long) id);
        objUnderTest.update(id,customerUpdate);

        Customer customerInst = objUnderTest.getById(id);
        assertNotNull(customerInst);
        assertEquals(customerInst.getCustomerRank(),"customerRank: update");
        assertEquals(customerInst.getName(),"name: update");
        assertEquals(customerInst.getRelatedParty().getName(),"refName: update");
        assertEquals(customerInst.getCharacteristic().get(0).getName(),"charName: _update_1");

        objUnderTest.deleteById(id);

    }

    @Test
    public void patch(){

        Customer customer = customer("1");
        objUnderTest.saveOrUpdate(customer);

        Serializable id = customer.getId();
        assertNotNull(id);

        Customer customerPatch = new Customer();

        customerPatch.setHref("href: patch");
        customerPatch.setName("name: patch");
        customerPatch.setStatus("status: patch");
        customerPatch.setDescription("description: patch");

        ArrayList<Characteristic> characteristics = new ArrayList<>();
        characteristics.add(characteristic("_patch_1"));
        characteristics.add(characteristic("_patch_2"));
        characteristics.add(characteristic("_patch_3"));

        customerPatch.setCharacteristic(characteristics);

        ArrayList<ContactMedium> contactMedia = new ArrayList<>();
        contactMedia.add(contactMedium("_1_1"));
        contactMedia.add(contactMedium("_patch_2"));
        contactMedia.add(contactMedium("_1_3"));

        customerPatch.setContactMedium(contactMedia);

        customerPatch.setCustomerAccount(null);

        objUnderTest.patch((Long) id,customerPatch);

        Customer patchedCustomer = objUnderTest.getById(id);
        assertNotNull(patchedCustomer);
        assertEquals(patchedCustomer.getCustomerRank(),"customerRank: 1");
        assertEquals(patchedCustomer.getName(),"name: patch");
        assertEquals(patchedCustomer.getRelatedParty().getName(),"refName: 1");
        assertEquals(patchedCustomer.getCharacteristic().get(0).getName(),"charName: _1_1");
        assertTrue(patchedCustomer.getContactMedium().size()==4);

        objUnderTest.deleteById(id);
    }
}