package com.wyett.jobant.task.model;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 17:13
 * @description: TODO
 */

public enum JobAntTaskMode {
    /** 传输文件 */
    SEND_FILE,

    /** 远程调用 */
    REMOTE_CALL,

    /** 部署任务 */
    DEPLOY_TASK;

    public boolean isSendFile() {
        return this.equals(JobAntTaskMode.SEND_FILE);
    }

    public boolean isRemoteCall() {
        return this.equals(JobAntTaskMode.REMOTE_CALL);
    }

    public boolean isDeployTask() {
        return this.equals(JobAntTaskMode.DEPLOY_TASK);
    }


}
