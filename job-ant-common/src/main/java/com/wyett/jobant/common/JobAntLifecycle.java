package com.wyett.jobant.common;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 15:28
 * @description: TODO
 */

public interface JobAntLifecycle {
    /**
     * start
     */
    void start();

    /**
     * stop
     */
    void stop();

    /**
     * check
     * @return
     */
    boolean isStarted();
}
