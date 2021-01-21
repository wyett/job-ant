package com.wyett.jobant.task.model;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 17:42
 * @description: TODO
 */

public enum JobAntStepMode {
    /**
     * un executed
     */
    UNEXEC,

    /**
     * success
     */
    SUCCESS,

    /**
     * failed
     */
    FAILED;

    public boolean isUnexec() {
        return equals(JobAntStepMode.UNEXEC);
    }

    public boolean isSucess() {
        return equals(JobAntStepMode.SUCCESS);
    }

    public boolean isFailed() {
        return equals(JobAntStepMode.FAILED);
    }
}
