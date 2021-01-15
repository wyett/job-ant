package com.wyett.jobant.common.log.impl;

import com.wyett.jobant.common.log.JobAntLog;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 17:23
 * @description: TODO
 */

public class JobAntLog4jImpl implements JobAntLog {

    private static final String FQCN = JobAntLog4jImpl.class.getName();

    private final Logger log;

    public JobAntLog4jImpl(String clazz) {
        log = Logger.getLogger(clazz);
    }

    @Override
    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    @Override
    public boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    @Override
    public void error(String s, Throwable e) {
        log.log(FQCN, Level.ERROR, s, e);
    }

    @Override
    public void error(String s) {
        log.log(FQCN, Level.ERROR, s, null);
    }

    @Override
    public void debug(String s) {
        log.log(FQCN, Level.DEBUG, s, null);
    }

    @Override
    public void trace(String s) {
        log.log(FQCN, Level.TRACE, s, null);
    }

    @Override
    public void warn(String s) {
        log.log(FQCN, Level.WARN, s, null);
    }

}
