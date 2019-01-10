package io.swagger.services.impl;

import io.swagger.configuration.HibernateXMLConfTest;
import io.swagger.model.BankAccount;
import io.swagger.model.CreditCard;
import io.swagger.model.PaymentMean;
import io.swagger.model.Reference;
import io.swagger.services.interfaces.PaymentMeanService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

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
public class PaymentMeanServiceImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    PaymentMeanService paymentMeanService;

    private static PaymentMean paymentMean(String prefix){

        PaymentMean paymentMean = new PaymentMean();

        paymentMean.setHref("Href: "+prefix);
        paymentMean.setName("name: "+prefix);
        paymentMean.setType("type: "+prefix);

        BankAccount bankAccount = new BankAccount();
        bankAccount.setIBAN("IBAN: "+prefix);
        bankAccount.setBIC("BIC: "+prefix);
        bankAccount.setDomiciliation("Domiciliation: "+prefix);
        bankAccount.setAccountHolder("AccountHolder: "+prefix);

        paymentMean.setBankAccount(bankAccount);

        Reference relatedParty = new Reference();
        relatedParty.setHref("href: "+prefix);
        relatedParty.setRole("role: "+prefix);
        relatedParty.setName("name: "+prefix);

        paymentMean.setRelatedParty(relatedParty);

        CreditCard creditCard = new CreditCard();
        creditCard.setCreditCardHolder("CreditCardHolder: "+prefix);
        creditCard.setNumber("number: "+prefix);
        creditCard.setType("type: "+prefix);
        creditCard.setExpirationDate(OffsetDateTime.parse("2020-07-07T21:36:10.598+05:30",
                DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        paymentMean.setCreditCard(creditCard);

        return paymentMean;
    }

    @Test
    public void saveGetDeleteList(){

        PaymentMean paymentMean1 = paymentMean("1");
        PaymentMean paymentMean2 = paymentMean("2");
        PaymentMean paymentMean3 = paymentMean("3");

        paymentMeanService.saveOrUpdate(paymentMean1);
        paymentMeanService.saveOrUpdate(paymentMean2);
        paymentMeanService.saveOrUpdate(paymentMean3);

        Serializable id1 = paymentMean1.getId();
        Serializable id2 = paymentMean2.getId();
        Serializable id3 = paymentMean3.getId();

        assertNotNull(id1);
        assertNotNull(id2);
        assertNotNull(id3);

        PaymentMean paymentMean1d = paymentMeanService.getById(id1);
        assertEquals(paymentMean1,paymentMean1d);
        assertEquals(paymentMean1.getRelatedParty().getHref(),"href: 1");

        List<PaymentMean> paymentMeanList = paymentMeanService.findList();
        assertNotNull(paymentMeanList);
        assertTrue(paymentMeanList.size()==3);
        assertTrue(paymentMeanList.get(0).getBankAccount().getIBAN().equals("IBAN: 1"));

        paymentMeanService.deleteById(id1);
        paymentMeanService.deleteById(id2);
        paymentMeanService.deleteById(id3);

    }

    @Test
    public void update(){

        PaymentMean paymentMean = paymentMean("new");
        PaymentMean paymentMeanUpdate = paymentMean("update");

        paymentMeanService.saveOrUpdate(paymentMean);

        Serializable id = paymentMean.getId();
        assertNotNull(id);

        paymentMeanUpdate.setId((Long) id);
        paymentMeanService.update(id,paymentMeanUpdate);

        assertEquals(paymentMeanService.getById(id).getBankAccount().getIBAN(),"IBAN: update");
        assertEquals(paymentMeanService.getById(id).getRelatedParty().getHref(),"href: update");
        assertEquals(paymentMeanService.getById(id).getCreditCard().getCreditCardHolder(),"CreditCardHolder: update");

        paymentMeanService.deleteById(id);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}