package com.wyett.jobant.task.entry;

import com.wyett.jobant.task.model.JobAntTaskMode;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 16:48
 * @description: TODO
 */

public class JobAntTaskMainEntry<T extends JobAntTaskStepEntry> {

    private String taskId;
    private String taskName;
    private JobAntTaskMode taskMode;
    private List<T> taskContext;
    private String taskScheduler;
    private String taskCallback;
    private String taskResult;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

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

    public List<T> getTaskContext() {
        return taskContext;
    }

    public void setTaskContext(List<T> taskContext) {
        this.taskContext = taskContext;
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
