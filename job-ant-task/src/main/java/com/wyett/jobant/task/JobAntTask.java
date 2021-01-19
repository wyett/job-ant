package com.wyett.jobant.task;

import com.wyett.jobant.task.parser.TaskParser;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 18:45
 * @description: TODO
 */

public interface JobAntTask {
    TaskParser getTaskParser();

    /**
     * 增量订阅与消费元数据管理器, taskAnt
     * @return
     */
    TaskMetaManager getTaskMetaManager();

    /**
     * 告警模块
     */
    TaskAlarmHandler getTaskAlarmHandler();

    /**
     * 客户端发生订阅/取消订阅行为
     */
    boolean subscribeChange(ClientIdentity identity);

    /**
     * 获取MQ配置
     * @return
     */
    JobAntMQConfig getMqConfig();
}
