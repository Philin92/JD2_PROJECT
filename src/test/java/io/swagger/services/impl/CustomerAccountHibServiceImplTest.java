package io.swagger.services.impl;

import io.swagger.configuration.HibernateXMLConfTest;
import io.swagger.model.*;
import io.swagger.services.impl.CustomerAccountHibServiceImpl;
import io.swagger.services.interfaces.CustomerAccountService;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class CustomerAccountHibServiceImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    CustomerAccountService objUnderTest;

    private static CustomerAccount customerAccount(String prefix){
        CustomerAccount customerAccount = new CustomerAccount();

        customerAccount.setHref("www.it-academy.by"+prefix);
        customerAccount.setName("CustomerAccount name: "+prefix);
        customerAccount.setDescription("Description: "+prefix);
        customerAccount.setStatus("Status: "+prefix);
        customerAccount.setAccountType("AccountType: "+prefix);
        customerAccount.setCreditLimit("Credit limit: "+prefix);
        customerAccount.setPin("Pin: "+prefix);
        customerAccount.setReceivableBalance(((float)(Math.random()*10)+0.1f));

        customerAccount.setCustomerAccountTaxExemption(List.of(
                custAccTaxExemption("1"),
                custAccTaxExemption("2"),
                custAccTaxExemption("3")
        ));

        customerAccount.setCustomerAccountRelationship(List.of(
                customerAccountRelationship("1"),
                customerAccountRelationship("2"),
                customerAccountRelationship("3")
        ));

        customerAccount.setContact(List.of(
                contact("1"),
                contact("2"),
                contact("3")
        ));

        CustomerRef customerRef = new CustomerRef();
        customerRef.setName("CustomerRef name");
        customerRef.setHref("www.href.ru");
        customerRef.setDescription("Description");

        customerAccount.setCustomerRef(customerRef);

        return customerAccount;
    }

    private static CustomerAccountTaxExemption custAccTaxExemption(String prefix){
        CustomerAccountTaxExemption customerAccountTaxExemption = new CustomerAccountTaxExemption();

        customerAccountTaxExemption.setIssuingJurisdiction("IssuingJurisdiction: "+prefix);
        customerAccountTaxExemption.setReason("Reason: "+prefix);
        customerAccountTaxExemption.setCertificateNumber("CertificateNumber: "+prefix);

        ValidFor validFor = new ValidFor();
        validFor.setStartDateTime(OffsetDateTime.now());
        validFor.setEndDateTime(OffsetDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC));

        customerAccountTaxExemption.setValidFor(validFor);

        return customerAccountTaxExemption;
    }

    private static CustomerAccountRelationship customerAccountRelationship(String prefix){
        CustomerAccountRelationship customerAccountRelationship = new CustomerAccountRelationship();

        customerAccountRelationship.setRelationshipType("Relationship type: "+prefix);

        ValidFor validFor = new ValidFor();
        validFor.setStartDateTime(OffsetDateTime.now());
        validFor.setEndDateTime(OffsetDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC));

        customerAccountRelationship.setValidFor(validFor);
        customerAccountRelationship.setCustomerAccount(List.of(
                customerAccountRef("1"),
                customerAccountRef("2"),
                customerAccountRef("3")
        ));

        return customerAccountRelationship;

    }

    private static CustomerAccountRef customerAccountRef(String prefix){
        CustomerAccountRef customerAccountRef = new CustomerAccountRef();

        customerAccountRef.setHref("www.it-academy.by "+prefix);
        customerAccountRef.setDescription("Description: "+prefix);
        customerAccountRef.setName("name: "+prefix);
        customerAccountRef.setStatus("status: "+prefix);

        return customerAccountRef;
    }

    private static Contact contact(String prefix){
        Contact contact = new Contact();

        contact.setContactName("ContactName: "+prefix);
        contact.setPartyRoleType("RoleType: "+prefix);

        ValidFor validFor = new ValidFor();
        validFor.setStartDateTime(OffsetDateTime.now());
        validFor.setEndDateTime(OffsetDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC));

        contact.setValidFor(validFor);
        contact.setContactType("ContactType: "+prefix);

        Reference reference = new Reference();
        reference.setHref("reference href: "+prefix);
        reference.setName("reference name: "+prefix);
        reference.setRole("reference role: "+prefix);

        contact.setRelatedParty(reference);

        contact.setContactMedium(List.of(
                contactMedium("1"),
                contactMedium("2"),
                contactMedium("3")
        ));

        return contact;
    }

    private static ContactMedium contactMedium(String prefix){
        ContactMedium contactMedium = new ContactMedium();

        contactMedium.setPreferred("Preferred: "+prefix);
        contactMedium.setType("Type: "+prefix);

        return contactMedium;
    }

    @Before
    public void setUp() throws Exception{}

    @After
    public void tearDown() throws Exception{}

    @Test
    public void saveListDeleteCustomerAccount(){
        CustomerAccount customerAccount = customerAccount("1");
        objUnderTest.saveOrUpdate(customerAccount);

        Serializable id = customerAccount.getId();
        assertNotNull(id);

        assertEquals(customerAccount.getCustomerRef().getName(),"CustomerRef name");

        List<CustomerAccount> customerAccountList = objUnderTest.findList();
        assertTrue(customerAccountList.size()==1);

        objUnderTest.deleteById(id);
    }

    @Test
    public void saveUpdateDelete(){
        CustomerAccount customerAccount2 = customerAccount("2");
        objUnderTest.saveOrUpdate(customerAccount2);

        Serializable id = customerAccount2.getId();
        assertNotNull(id);

        CustomerAccount customerAccountUpdate = customerAccount("update");
        customerAccountUpdate.setId((Long) id);
        objUnderTest.update(id,customerAccountUpdate);

        CustomerAccount customerAccount = objUnderTest.getById(id);
        assertNotNull(customerAccount);
        assertEquals("Reason: 1",customerAccount.getCustomerAccountTaxExemption().get(0).getReason());

        objUnderTest.deleteById(id);

    }

    @Test
    public void patch(){

        CustomerAccount customerAccount = customerAccount("F");
        objUnderTest.saveOrUpdate(customerAccount);

        Serializable id = customerAccount.getId();
        assertNotNull(id);

        CustomerAccount customerAccountPatch = new CustomerAccount();

        customerAccountPatch.setName("CustomerAccount name: P");
        customerAccountPatch.setDescription("Description: P");
        customerAccountPatch.setCreditLimit("Credit limit: P");
        customerAccountPatch.setPin("Pin: F");

        customerAccountPatch.setCustomerAccountRelationship(List.of(
                customerAccountRelationship("1"),
                customerAccountRelationship("2"),
                customerAccountRelationship("3")
        ));

        customerAccountPatch.setContact(List.of(
                contact("1P"),
                contact("2P"),
                contact("3P")
        ));

        CustomerRef customerRef = new CustomerRef();
        customerRef.setName("CustomerRef name");
        customerRef.setHref("www.href.ru");
        customerRef.setDescription("Description");

        customerAccountPatch.setCustomerRef(customerRef);


        objUnderTest.patch((Long) id,customerAccountPatch);

        CustomerAccount patchedCustomerAccount = objUnderTest.getById(id);
        assertNotNull(patchedCustomerAccount);
        assertEquals(patchedCustomerAccount.getStatus(),"Status: F");
        assertEquals(patchedCustomerAccount.getName(),"CustomerAccount name: P");
        assertTrue(patchedCustomerAccount.getContact().size()==6);

        objUnderTest.deleteById(id);
        /*assertEquals(patchedCustomerAccount.getContact().get(0).getContactName(),"ContactName: 1P");*/
    }

}
