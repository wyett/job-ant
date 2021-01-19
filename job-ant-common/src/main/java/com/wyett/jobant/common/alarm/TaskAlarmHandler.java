package com.wyett.jobant.common.alarm;

import com.wyett.jobant.common.JobAntLifecycle;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 18:59
 * @description: TODO
 */

public interface TaskAlarmHandler<T> extends JobAntLifecycle {

    /**
     * task alarm
     * @param t task info
     * @param msg alarm info
     */
    void taskAlarm(T t, String msg);
}
