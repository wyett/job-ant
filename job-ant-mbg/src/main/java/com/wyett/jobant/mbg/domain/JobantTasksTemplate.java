package com.wyett.jobant.mbg.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class JobantTasksTemplate implements Serializable {
    private Long id;

    private Long schedulerId;

    private Long childName;

    private String taskEnv;

    private String taskInfo;

    private String taskReturn;

    private String taskFailCall;

    private String taskSuccessCall;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(Long schedulerId) {
        this.schedulerId = schedulerId;
    }

    public Long getChildName() {
        return childName;
    }

    public void setChildName(Long childName) {
        this.childName = childName;
    }

    public String getTaskEnv() {
        return taskEnv;
    }

    public void setTaskEnv(String taskEnv) {
        this.taskEnv = taskEnv;
    }

    public String getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo;
    }

    public String getTaskReturn() {
        return taskReturn;
    }

    public void setTaskReturn(String taskReturn) {
        this.taskReturn = taskReturn;
    }

    public String getTaskFailCall() {
        return taskFailCall;
    }

    public void setTaskFailCall(String taskFailCall) {
        this.taskFailCall = taskFailCall;
    }

    public String getTaskSuccessCall() {
        return taskSuccessCall;
    }

    public void setTaskSuccessCall(String taskSuccessCall) {
        this.taskSuccessCall = taskSuccessCall;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", schedulerId=").append(schedulerId);
        sb.append(", childName=").append(childName);
        sb.append(", taskEnv=").append(taskEnv);
        sb.append(", taskInfo=").append(taskInfo);
        sb.append(", taskReturn=").append(taskReturn);
        sb.append(", taskFailCall=").append(taskFailCall);
        sb.append(", taskSuccessCall=").append(taskSuccessCall);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}