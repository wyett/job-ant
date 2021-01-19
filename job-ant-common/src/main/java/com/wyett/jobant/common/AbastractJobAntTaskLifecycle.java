package com.wyett.jobant.common;

import com.wyett.jobant.common.log.JobAntLog;
import com.wyett.jobant.common.log.JobAntLogFactory;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 18:28
 * @description: TODO
 */

public class AbastractJobAntTaskLifecycle implements JobAntLifecycle {

    protected volatile boolean running = false;

    @Override
    public void start() {
        if(running) {
            throw new JobAntException(this.getClass().getName() + "is running, can not rerun");
        }

        running = true;
    }

    @Override
    public void stop() {
        if(!running) {
            throw new JobAntException(this.getClass().getName() + "is stoped");
        }

        running = false;
    }

    @Override
    public boolean isStarted() {
        return this.running;
    }
}
