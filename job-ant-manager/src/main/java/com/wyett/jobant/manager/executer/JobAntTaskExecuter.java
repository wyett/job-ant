package com.wyett.jobant.manager.executer;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 18:09
 * @description: TODO
 */

public interface JobAntTaskExecuter<T> {

    /**
     * init taskExecute
     */
    void init();

    /**
     * execute
     */
    void excute();

    /**
     * stop execute
     */
    void stop();

    /**
     * task call back
     */
    interface CallBack {
        /**
         * commit when sucess
         */
        void commit();

        /**
         * rollback when failed
         */
        void rollback();
    }

}
