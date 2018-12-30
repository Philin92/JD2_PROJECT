package io.swagger.dao;

import io.swagger.model.BankAccount;
import io.swagger.model.CustomerAccount;
import io.swagger.services.BaseServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Repository
public class CustomerAccountDaoImpl<T> extends BaseDaoImpl {

    private static Logger log = Logger.getLogger(CustomerAccountDaoImpl.class.getName());

    public CustomerAccountDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List find() {

        log.info("Call find(): ");
        return openSession().createQuery("from CustomerAccount").list();
    }

    @Override
    public void deleteById(Serializable id) {
        log.info("Call delete(): ");
        Session session = openSession();
        CustomerAccount customerAccount = session.get(CustomerAccount.class,id);
        session.delete(customerAccount);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getById(Serializable id) {

        log.info("Call getById(): ");
        return (T) openSession().get(CustomerAccount.class,id);
    }

    public void save(T item) {
        openSession().saveOrUpdate(item);
    }
}
