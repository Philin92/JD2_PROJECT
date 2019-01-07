package io.swagger.dao.impl;

import io.swagger.dao.interfaces.BaseHibernateDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public abstract class BaseHibernateDaoImpl<T, PK extends Serializable> implements BaseHibernateDao<T,PK> {

    private Class<T> persistentClass;
    private static Logger log = Logger.getLogger(BaseHibernateDaoImpl.class.getName());

    @Autowired
    SessionFactory sessionFactory;

    Session openSession(){return sessionFactory.getCurrentSession();}

    BaseHibernateDaoImpl(Class<T> persistentClass){
        this.persistentClass = persistentClass;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @Override
    public void saveOrUpdate(T entity) {
        log.info("Call saveOrUpdate(): ");
        System.out.println(getPersistentClass().getName());
        System.out.println(getPersistentClass().getSimpleName());
        openSession().saveOrUpdate(entity);
    }

    @Override
    public T getById(PK id) {
        log.info("Call getById(): ");
        return openSession().get(getPersistentClass(),id);
    }

    @Override
    public void deleteById(PK id) {
        log.info("Call deleteById(): ");
        Session session = openSession();

        T entity = session.get(getPersistentClass(),id);
        session.delete(entity);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findList() {
        log.info("Call find(): ");
        return openSession().createQuery("from "+persistentClass.getSimpleName()).list();
    }

    @Override
    public T update(PK id, T updateEntity){
        log.info("Call update(): ");
        T entity = getById(id);
        BeanUtils.copyProperties(updateEntity,entity);
        saveOrUpdate(entity);

        return entity;
    }
}
