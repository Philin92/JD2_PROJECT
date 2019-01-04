package io.swagger.services;

import io.swagger.configuration.HibernateXMLConfTest;
import io.swagger.model.CustomerAccount;
import io.swagger.services.impl.CustomerAccountHibServiceImpl;
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
public class CustomerAccountServiceImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    CustomerAccountHibServiceImpl objUnderTest;

    public static CustomerAccount customerAccount(String prefix){
        CustomerAccount customerAccount = new CustomerAccount();
        customerAccount.setCreditLimit("100500"+prefix);
        customerAccount.setDescription("description"+prefix);
        customerAccount.setName("CustomerAccount"+prefix);
        customerAccount.accountType("Type"+prefix);
        return customerAccount;
    }

    @Before
    public void setUp() throws Exception{}

    @After
    public void tearDown() throws Exception{}

    @Test
    @Ignore
    public void list(){

        CustomerAccount customerAccount1 = customerAccount("1");
        objUnderTest.saveOrUpdate(customerAccount1);

        Serializable id = customerAccount1.getId();
        assertNotNull(id);

    }
}
