package com.wyett.jobant.manager.entry;

import com.wyett.jobant.common.entry.JobAntTypeEntry;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 14:40
 * @description: TODO
 */

public class JobAntManager {

    private String managerIp;
    private String managerPort;
    private String serveiceName;
    private JobAntTypeEntry.ClusterMode nodeRole;

    public String getManagerIp() {
        return managerIp;
    }

    public void setManagerIp(String managerIp) {
        this.managerIp = managerIp;
    }

    public String getManagerPort() {
        return managerPort;
    }

    public void setManagerPort(String managerPort) {
        this.managerPort = managerPort;
    }

    public String getServeiceName() {
        return serveiceName;
    }

    public void setServeiceName(String serveiceName) {
        this.serveiceName = serveiceName;
    }

    public JobAntTypeEntry.ClusterMode getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(JobAntTypeEntry.ClusterMode nodeRole) {
        this.nodeRole = nodeRole;
    }
}
