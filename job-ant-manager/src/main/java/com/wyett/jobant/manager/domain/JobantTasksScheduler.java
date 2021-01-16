package com.wyett.jobant.manager.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class JobantTasksScheduler implements Serializable {
    private Long id;

    private String taskName;

    private String taskEnv;

    @ApiModelProperty(value = "0: , 1: ")
    private Integer taskStatus;

    private Integer taskInverval;

    private Date startTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskEnv() {
        return taskEnv;
    }

    public void setTaskEnv(String taskEnv) {
        this.taskEnv = taskEnv;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getTaskInverval() {
        return taskInverval;
    }

    public void setTaskInverval(Integer taskInverval) {
        this.taskInverval = taskInverval;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskName=").append(taskName);
        sb.append(", taskEnv=").append(taskEnv);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", taskInverval=").append(taskInverval);
        sb.append(", startTime=").append(startTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}