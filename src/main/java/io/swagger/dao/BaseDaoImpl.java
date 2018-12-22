package io.swagger.dao;

import io.swagger.model.CustomerAccount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDaoImpl<T> {

    public List<T> find(){
        return List.of();
    }

    public boolean add(List<T> items){
        return false;
    }

    private T testData(String prefix){

        CustomerAccount customerAccount = new CustomerAccount();

        customerAccount.setAccountType("accountType"+prefix);
        customerAccount.setCreditLimit("100000");
        customerAccount.setDescription("desc"+prefix);
        customerAccount.setName("account"+prefix);

        return (T) customerAccount;
    }
}
