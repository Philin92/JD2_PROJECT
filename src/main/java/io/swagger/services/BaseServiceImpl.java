package io.swagger.services;

import io.swagger.dao.BaseDaoImpl;
import io.swagger.model.CustomerAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class BaseServiceImpl<T> {

    private static Logger log = Logger.getLogger(BaseServiceImpl.class.getName());

    @Autowired
    private BaseDaoImpl<CustomerAccount> customerAccountBaseDao;

    public List<T> list(){
        log.info("customerAccountBaseDao: "+customerAccountBaseDao);
        return (List<T>) customerAccountBaseDao.find();
    }

}
