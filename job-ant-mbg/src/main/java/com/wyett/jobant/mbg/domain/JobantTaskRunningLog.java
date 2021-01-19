package com.wyett.jobant.mbg.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class JobantTaskRunningLog implements Serializable {
    private Long id;

    private Integer taskSchedulerId;

    private Integer taskChildId;

    private String loginfo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTaskSchedulerId() {
        return taskSchedulerId;
    }

    public void setTaskSchedulerId(Integer taskSchedulerId) {
        this.taskSchedulerId = taskSchedulerId;
    }

    public Integer getTaskChildId() {
        return taskChildId;
    }

    public void setTaskChildId(Integer taskChildId) {
        this.taskChildId = taskChildId;
    }

    public String getLoginfo() {
        return loginfo;
    }

    public void setLoginfo(String loginfo) {
        this.loginfo = loginfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskSchedulerId=").append(taskSchedulerId);
        sb.append(", taskChildId=").append(taskChildId);
        sb.append(", loginfo=").append(loginfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}