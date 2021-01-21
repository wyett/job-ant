package com.wyett.jobant.task.entry;

import com.wyett.jobant.task.model.JobAntStepMode;

import java.util.Map;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 17:32
 * @description: TODO
 */

public class JobAntTaskStepEntry {
    // stepId
    private long stepId;
    private String stepName;
    private String stepHost;

    // exec env
    private String stepEnv;
    private String stepScripts;
    private Map<String, Object> stepParams;
    private long stepExecuteTime;
    private long maxRequestTime;
    private JobAntStepMode stepCondition;
    private JobAntStepMode stepResult;
    private String stepFailedScripts;
    private String[] stepFailedParams;

    public String getStepFailedScripts() {
        return stepFailedScripts;
    }

    public void setStepFailedScripts(String stepFailedScripts) {
        this.stepFailedScripts = stepFailedScripts;
    }

    public String[] getStepFailedParams() {
        return stepFailedParams;
    }

    public void setStepFailedParams(String[] stepFailedParams) {
        this.stepFailedParams = stepFailedParams;
    }

    public long getStepId() {
        return stepId;
    }

    public void setStepId(long stepId) {
        this.stepId = stepId;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public String getStepHost() {
        return stepHost;
    }

    public void setStepHost(String stepHost) {
        this.stepHost = stepHost;
    }

    public String getStepEnv() {
        return stepEnv;
    }

    public void setStepEnv(String stepEnv) {
        this.stepEnv = stepEnv;
    }

    public String getStepScripts() {
        return stepScripts;
    }

    public void setStepScripts(String stepScripts) {
        this.stepScripts = stepScripts;
    }

    public Map<String, Object> getStepParams() {
        return stepParams;
    }

    public void setStepParams(Map<String, Object> stepParams) {
        this.stepParams = stepParams;
    }

    public long getStepExecuteTime() {
        return stepExecuteTime;
    }

    public void setStepExecuteTime(long stepExecuteTime) {
        this.stepExecuteTime = stepExecuteTime;
    }

    public long getMaxRequestTime() {
        return maxRequestTime;
    }

    public void setMaxRequestTime(long maxRequestTime) {
        this.maxRequestTime = maxRequestTime;
    }

    public JobAntStepMode getStepCondition() {
        return stepCondition;
    }

    public void setStepCondition(JobAntStepMode stepCondition) {
        this.stepCondition = stepCondition;
    }

    public JobAntStepMode getStepResult() {
        return stepResult;
    }

    public void setStepResult(JobAntStepMode stepResult) {
        this.stepResult = stepResult;
    }
}
