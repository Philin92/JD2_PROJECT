package io.swagger.dao;

import io.swagger.model.BankAccount;
import io.swagger.model.CustomerAccount;
import io.swagger.services.BaseServiceImpl;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Repository
public class CustomerAccountDaoImpl<T> extends BaseDaoImpl {

    private static Logger log = Logger.getLogger(BaseServiceImpl.class.getName());

    @Override
    public List find() {
        createTestData();

        Session session = openSession();
        List<T> list = session.createQuery("from CustomerAccount").list();
        session.close();
        return list;
    }

    private void createTestData(){
        Session session = openSession();

        try {
            session.beginTransaction();
            session.saveOrUpdate(customerAccount("1"));
            session.saveOrUpdate(customerAccount("2"));
            session.saveOrUpdate(customerAccount("3"));
            session.getTransaction().commit();
        } catch (Exception e) {
            log.log(Level.SEVERE,"Error during creation of test data",e);
            if(session.getTransaction() != null){session.getTransaction().rollback();}
        } finally {
            session.close();
        }
    }

    private T customerAccount(String prefix){
        CustomerAccount customerAccount = new CustomerAccount();
        /*customerAccount.setName("CustomerName"+prefix);
        customerAccount.setDescription("Description"+prefix);
        customerAccount.setAccountType("AccountType"+prefix);*/
        customerAccount.setName("CustomerAccount"+prefix);
        customerAccount.setDescription("Description"+prefix);
        customerAccount.setCreditLimit("10000"+prefix);

        return (T)customerAccount;
    }
}
