package com.wyett.jobant.common.entry;

import java.util.Date;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/21 15:47
 * @description: heatbeat entry
 */

public class HeartbeatEntry {
    private String host;
    private String serverName;
    private JobAntTypeEntry.NodeType nodeType;
    private Date time;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public JobAntTypeEntry.NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(JobAntTypeEntry.NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "HeartbeatEntry{" +
                "host='" + host + '\'' +
                ", serverName='" + serverName + '\'' +
                ", nodeType=" + nodeType +
                ", time=" + time +
                '}';
    }
}
