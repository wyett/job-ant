package com.wyett.jobant.manager.entry;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 14:40
 * @description: TODO
 */

public class JobAntManager {

    private String managerIp;
    private String managerPort;
    private String serveiceName;
    private JobAntParameter.ClusterMode nodeRole;

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

    public JobAntParameter.ClusterMode getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(JobAntParameter.ClusterMode nodeRole) {
        this.nodeRole = nodeRole;
    }
}
