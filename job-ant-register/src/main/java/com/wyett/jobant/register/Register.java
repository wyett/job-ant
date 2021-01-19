package com.wyett.jobant.register;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 14:27
 * @description: TODO
 */

public interface Register<T> {

    /**
     * registe on
     * @param t
     */
    void regsite(T t);

    /**
     * unregiste
     * @param t
     */
    void unRegiste(T t);

    /**
     * elect active
     * @return
     */
    T elect();
}
