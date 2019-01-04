package io.swagger.services.interfaces;

import java.io.Serializable;
import java.util.List;

public interface BaseHibernateService<T, PK extends Serializable> {

    void saveOrUpdate(T entity);

    T getById(PK id);

    void deleteById(PK id);

    List<T> findList();

    T update(PK id, T entity);

    void create(List<T> entities);
}
