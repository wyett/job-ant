package com.wyett.jobant.task;

import com.wyett.jobant.common.JobAntMQConfig;
import com.wyett.jobant.register.entries.RegisterEntry;
import com.wyett.jobant.task.meta.JobAntTaskMetaManager;
import com.wyett.jobant.task.parser.JobAntTaskParser;
import com.wyett.jobant.task.store.JobAntTaskStore;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 18:45
 * @description: TODO
 */

public interface JobAntTask {

    /**
     * task生成器
     * @return
     */
    //JobAntTaskBuilder getTaskBuilder();

    /**
     * task解析器
     * @return
     */
    JobAntTaskParser getTaskParser();

    /**
     * 增量订阅与消费元数据管理器, taskAnt
     * @return
     */
    JobAntTaskMetaManager getTaskMetaManager();

    /**
     * task存储
     */
    JobAntTaskStore getTaskStore();

    /**
     * 告警模块
     */
    //TaskAlarmHandler getTaskAlarmHandler();

    /**
     * 客户端发生订阅/取消订阅行为
     */
    boolean subscribeChange(RegisterEntry entry);

    /**
     * 获取MQ配置
     * @return
     */
    JobAntMQConfig getMqConfig();
}
