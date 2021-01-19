package com.wyett.jobant.manager;

import com.wyett.jobant.common.JobAntException;
import com.wyett.jobant.common.log.JobAntLog;
import com.wyett.jobant.common.log.JobAntLogFactory;
import org.apache.commons.lang.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/16 16:44
 * @description: TODO
 */

public class ManagerLanucher {

    public static final JobAntLog log = JobAntLogFactory.getLog(ManagerLanucher.class);

    public static final String CLASSPATH_URL_PREFIX = "classpass:";

    public static void main(String[] args) throws IOException {
        try {
            //global unCaughtException
            setGlobalUncaughtExceptionHandler();

            //load properties
            log.info("## load manager configurations");
            String conf = System.getProperty("jobant.conf", "classpath:canal.properties");
            Properties properties = new Properties();
            if (conf.startsWith(CLASSPATH_URL_PREFIX)) {
                conf = StringUtils.substringAfter(conf, CLASSPATH_URL_PREFIX);
                properties.load(ManagerLanucher.class.getClassLoader().getResourceAsStream(conf));
            } else {
                properties.load(new FileInputStream(conf));
            }

            //build ManagerStarter
            ManagerStarter managerStarter = new ManagerStarter(properties);

        } catch (JobAntException e) {

        }

    }

    public static void setGlobalUncaughtExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                log.error("UnCaughtException:" + e);
            }});
    }
}
