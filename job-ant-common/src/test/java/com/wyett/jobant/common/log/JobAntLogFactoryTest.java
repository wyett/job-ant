package com.wyett.jobant.common.log;

import com.wyett.jobant.common.log.impl.JobAntLog4jImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 17:24
 * @description: TODO
 */

public class JobAntLogFactoryTest {

    @Test
    public void testJobAntLog4jImpl() {
        JobAntLogFactory.useLog4jLogging();
        JobAntLog log = JobAntLogFactory.getLog(Object.class);
        logSomething(log);
        assertEquals(log.getClass().getName(), JobAntLog4jImpl.class.getName());

    }

    private void logSomething(JobAntLog log) {
        log.warn("Warning message.");
        log.debug("Debug message.");
        log.error("Error message.");
        log.error("Error with Exception.", new Exception("Test exception."));
    }
}
