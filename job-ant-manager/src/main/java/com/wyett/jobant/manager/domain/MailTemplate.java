package com.wyett.jobant.manager.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class MailTemplate implements Serializable {
    private Long id;

    private String sendTo;

    private String duplicateTo;

    @ApiModelProperty(value = "html, txt")
    private String mailType;

    private Integer mailStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getDuplicateTo() {
        return duplicateTo;
    }

    public void setDuplicateTo(String duplicateTo) {
        this.duplicateTo = duplicateTo;
    }

    public String getMailType() {
        return mailType;
    }

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    public Integer getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(Integer mailStatus) {
        this.mailStatus = mailStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sendTo=").append(sendTo);
        sb.append(", duplicateTo=").append(duplicateTo);
        sb.append(", mailType=").append(mailType);
        sb.append(", mailStatus=").append(mailStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}