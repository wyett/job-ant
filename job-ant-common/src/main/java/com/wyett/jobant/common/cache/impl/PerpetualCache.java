package com.wyett.jobant.common.cache.impl;

import com.wyett.jobant.common.cache.Cache;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/16 19:08
 * @description: TODO
 */

public class PerpetualCache implements Cache {
    @Override
    public String getId() {
        return null;
    }

    @Override
    public void putObject(Object key, Object value) {

    }

    @Override
    public Object getObject(Object key) {
        return null;
    }

    @Override
    public Object removeObject(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}
