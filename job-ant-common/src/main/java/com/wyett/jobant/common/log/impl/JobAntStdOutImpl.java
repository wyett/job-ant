package com.wyett.jobant.common.log.impl;

import com.wyett.jobant.common.log.JobAntLog;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 17:23
 * @description: TODO
 */

public class JobAntStdOutImpl implements JobAntLog {

    public JobAntStdOutImpl() {}

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public void error(String s, Throwable e) {
        System.err.println(s);
        e.printStackTrace(System.err);
    }

    @Override
    public void error(String s) {
        System.err.println(s);
    }

    @Override
    public void debug(String s) {
        System.out.println(s);
    }

    @Override
    public void trace(String s) {
        System.out.println(s);
    }

    @Override
    public void warn(String s) {
        System.out.println(s);
    }

}
