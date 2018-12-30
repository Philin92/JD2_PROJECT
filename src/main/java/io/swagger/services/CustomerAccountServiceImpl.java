package io.swagger.services;

import io.swagger.dao.CustomerAccountDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class CustomerAccountServiceImpl<T> extends BaseServiceImpl {

    private static Logger log = Logger.getLogger(CustomerAccountServiceImpl.class.getName());

    @Autowired
    private CustomerAccountDaoImpl<T> customerAccountDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List list() {
        log.info("bankAccountDao: "+customerAccountDao);
        return customerAccountDao.find();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public void save(T item) {
        log.info("save(): "+item);
        customerAccountDao.save(item);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public void create(List<T> items){
        log.info("create: "+items);
        for (T t : items) {
            save(t);
        }
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public void delete(Serializable id){
        log.info("deleteById: "+id);
        customerAccountDao.deleteById(id);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public T getById(Serializable id){
        log.info("get object by id: "+id);
        return customerAccountDao.getById(id);
    }
}
