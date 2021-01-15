package com.wyett.jobant.common.log;

import com.wyett.jobant.common.JobAntException;

import java.lang.reflect.Constructor;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 17:24
 * @description: TODO
 */

public class JobAntLogFactory {

    /**
     * Marker
     */
    public static final String MARKER = "JOBANT";

    private static Constructor<? extends JobAntLog> logConstructor;

    static {
        tryImplementation(JobAntLogFactory::useLog4jLogging);
        tryImplementation(JobAntLogFactory::useStdOutLogging);
    }

    public JobAntLogFactory() {
        // disable construct
    }

    public static synchronized void useCustomLogging(Class<? extends JobAntLog> clazz) {
        setImplementation(clazz);
    }

    public static synchronized void useLog4jLogging() {
        setImplementation(com.wyett.jobant.common.log.impl.JobAntLog4jImpl.class);
    }

    public static synchronized void useStdOutLogging() {
        setImplementation(com.wyett.jobant.common.log.impl.JobAntStdOutImpl.class);
    }

    public static JobAntLog getLog(Class<?> aClass) {
        return getLog(aClass.getName());
    }

    public static JobAntLog getLog(String logger) {
        try {
            return logConstructor.newInstance(logger);
        } catch (Throwable t) {
            throw new JobAntException("Error creating logger for logger " + logger + ".  Cause: " + t, t);
        }
    }



    private static void tryImplementation(Runnable runnable) {
        if (logConstructor == null) {
            try {
                runnable.run();
            } catch (Throwable t) {
                // ignore
            }
        }
    }

    private static void setImplementation(Class<? extends JobAntLog> implClass) {
        try {
            Constructor<? extends JobAntLog> candidate = implClass.getConstructor(String.class);
            JobAntLog log = candidate.newInstance(JobAntLogFactory.class.getName());
            if (log.isDebugEnabled()) {
                log.debug("Logging initialized using '" + implClass + "' adapter.");
            }
            logConstructor = candidate;
        } catch (Throwable t) {
            throw new JobAntException("Error setting Log implementation.  Cause: " + t, t);
        }
    }
}
