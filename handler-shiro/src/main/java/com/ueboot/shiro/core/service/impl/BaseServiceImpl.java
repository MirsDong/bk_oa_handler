/*
 * Copyright (c)  2016, dabing.io
 * All rights reserved.
 * BaseServiceImpl.java 2017-10-09 上午8:58
 */

package com.ueboot.shiro.core.service.impl;

import com.ueboot.shiro.core.repository.BaseRepository;
import com.ueboot.shiro.core.service.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述:基础服务其他service继承该类即可获取常用服务功能
 *
 * @author yangkui create on 2017-10-09.
 * @since 1.0
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {


    @Override
    public List<T> findAll() {
        return getBaseRepository().findAll();
    }

    @Override
    public Page<T> findBy(Pageable pageable) {
        return getBaseRepository().findAll(pageable);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 30, propagation = Propagation.REQUIRED)
    public T save(T object) {
        return (T) getBaseRepository().save(object);
    }


    @Override
    public T get(Long id) {
        return (T) getBaseRepository().getOne(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 30, propagation = Propagation.REQUIRED)
    public void delete(Long[] ids) {
        for (Long id : ids) {
            getBaseRepository().delete(id);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 30, propagation = Propagation.REQUIRED)
    public void delete(Long id) {
        getBaseRepository().delete(id);
    }

    protected abstract BaseRepository getBaseRepository();
}