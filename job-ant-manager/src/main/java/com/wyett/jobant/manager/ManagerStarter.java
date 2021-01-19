package com.wyett.jobant.manager;

import com.wyett.jobant.common.log.JobAntLog;
import com.wyett.jobant.common.log.JobAntLogFactory;

import java.util.Properties;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 15:25
 * @description: TODO
 */

public class ManagerStarter {

    public static final JobAntLog log = JobAntLogFactory.getLog(ManagerStarter.class);

    private volatile Properties properties;

    public ManagerStarter(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public synchronized void start() {



    }

    public synchronized void stop() {

    }

    public synchronized void reload() {

    }

}
