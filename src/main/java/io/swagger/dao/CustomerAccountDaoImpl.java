package io.swagger.dao;

import io.swagger.model.BankAccount;
import io.swagger.model.CustomerAccount;
import io.swagger.services.BaseServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

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

        log.info("Call find()");
        return openSession().createQuery("from CustomerAccount").list();
    }

    public void createTestData(){

        log.info("Call createTestData()");
        Session session = openSession();

            session.saveOrUpdate(customerAccount("1"));
            session.saveOrUpdate(customerAccount("2"));
            session.saveOrUpdate(customerAccount("3"));

            session.getTransaction().commit();

    }

    private T customerAccount(String prefix){
        CustomerAccount customerAccount = new CustomerAccount();

        customerAccount.setName("CustomerAccount"+prefix);
        customerAccount.setDescription("Description"+prefix);
        customerAccount.setCreditLimit("10000"+prefix);

        return (T)customerAccount;
    }
}
