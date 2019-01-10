package io.swagger.services.impl;

import io.swagger.configuration.HibernateXMLConfTest;
import io.swagger.model.*;
import io.swagger.services.interfaces.HubService;
import org.junit.After;
import org.junit.Before;
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
public class HubServiceImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    HubService hubService;

    private static Hub hub(String prefix){
        Hub hub = new Hub();
        hub.setCallback("Callback: "+prefix);
        hub.setQuery("Query: "+prefix);

        return hub;
    }

    @Test
    public void saveGetDeleteList(){

        Hub hub1 = hub("1");
        Hub hub2 = hub("2");
        Hub hub3 = hub("3");

        hubService.saveOrUpdate(hub1);
        hubService.saveOrUpdate(hub2);
        hubService.saveOrUpdate(hub3);

        Serializable id1 = hub1.getId();
        Serializable id2 = hub2.getId();
        Serializable id3 = hub3.getId();

        assertNotNull(id1);
        assertNotNull(id2);
        assertNotNull(id3);

        Hub hub2d = hubService.getById(id1);
        assertEquals(hub1,hub2d);
        assertEquals(hub1.getCallback(),"Callback: 1");

        List<Hub> hubList = hubService.findList();
        assertNotNull(hubList);
        assertTrue(hubList.size() == 3);

        hubService.deleteById(id1);
        hubService.deleteById(id2);
        hubService.deleteById(id3);
    }

    @Test
    public void update(){

        Hub hub = hub("new");
        Hub hubUpdate = hub("update");

        hubService.saveOrUpdate(hub);

        Serializable id = hub.getId();
        assertNotNull(id);

        hubUpdate.setId((String) id);
        hubService.update(id,hubUpdate);

        assertNotNull(hubService.getById(id));
        assertEquals(hubService.getById(id).getQuery(),"Query: update");

        hubService.deleteById(id);
    }



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}