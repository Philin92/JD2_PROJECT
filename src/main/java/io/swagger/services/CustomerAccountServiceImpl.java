package io.swagger.services;

import io.swagger.dao.CustomerAccountDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CustomerAccountServiceImpl<T> extends BaseServiceImpl {

    private static Logger log = Logger.getLogger(CustomerAccountServiceImpl.class.getName());

    @Autowired
    private CustomerAccountDaoImpl<T> customerAccountDao;

    @Override
    public List list() {
        log.info("bankAccountDao: "+customerAccountDao);
        return customerAccountDao.find();
    }
}
