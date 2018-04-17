package com.asuka.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

    List<T> getAll();

    T getById(Serializable id);

    int save(T t);

    int update(T t);

    int delete(Serializable id);

}
