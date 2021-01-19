package com.wyett.jobant.task.model;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 16:48
 * @description: TODO
 */

public class JobAntTask {

    private String taskName;
    private JobAntTaskMode taskMode;
    private JobAntTaskModel jobAntTaskModel;
    private String taskScheduler;
    private String taskCallback;
    private String taskResult;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public JobAntTaskMode getTaskMode() {
        return taskMode;
    }

    public void setTaskMode(JobAntTaskMode taskMode) {
        this.taskMode = taskMode;
    }

    public JobAntTaskModel getJobAntTaskModel() {
        return jobAntTaskModel;
    }

    public void setJobAntTaskModel(JobAntTaskModel jobAntTaskModel) {
        this.jobAntTaskModel = jobAntTaskModel;
    }

    public String getTaskScheduler() {
        return taskScheduler;
    }

    public void setTaskScheduler(String taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    public String getTaskCallback() {
        return taskCallback;
    }

    public void setTaskCallback(String taskCallback) {
        this.taskCallback = taskCallback;
    }

    public String getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(String taskResult) {
        this.taskResult = taskResult;
    }
}
