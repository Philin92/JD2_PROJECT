package io.swagger.services.impl;

import io.swagger.dao.interfaces.BaseHibernateDao;
import io.swagger.services.interfaces.BaseHibernateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public abstract class BaseHibernateServiceImpl<T,PK extends Serializable>
        implements BaseHibernateService<T,PK> {

    private static Logger log = Logger.getLogger(BaseHibernateServiceImpl.class.getName());

    private BaseHibernateDao<T,PK> dao;

    public BaseHibernateServiceImpl(BaseHibernateDao<T,PK> dao){
        this.dao = dao;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public void saveOrUpdate(T entity) {
        log.info("BaseHibernateDao: saveOrUpdate() "+dao);
        dao.saveOrUpdate(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public void create(List<T> entities){
        log.info("create: "+entities);
        for(T t: entities){
            saveOrUpdate(t);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public T getById(PK id) {
        log.info("BaseHibernateDao: getById() "+dao);
        return dao.getById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public void deleteById(PK id) {
        log.info("BaseHibernateDao: deleteById() "+dao);
        dao.deleteById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<T> findList() {
        log.info("BaseHibernateDao: findList() "+dao);
        return dao.findList();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public T update(PK id, T entity) {
        log.info("BaseHibernateDao: update() "+dao);
        return dao.update(id,entity);
    }
}
