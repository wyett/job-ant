package com.wyett.jobant.manager.common;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 11:35
 * @description: TODO
 */

public class ManagerProps implements Serializable {

    private static final long serialVersionUID = 3895442484844379792L;



    public static final String ROOT                               = "jobant";
    public static final String MANAGER_ROOT                       = ROOT + "." + "manager";
    public static final String MANAGER_REGISTER_IP                = MANAGER_ROOT + "." + "manager.register.ip";
    public static final String Manager_REGISTER_PORT              = MANAGER_ROOT + "." + "manager.register.port";
    public static final String MANAGER_METRICS_PORT               = MANAGER_ROOT + "." + "manager.metrics.port";

    // cluster
    public static final String MANAGER_CLUSTER_MODE               = MANAGER_ROOT + "." + "manager.cluster.mode";

    // ha
    public static final String MANAGER_HA_METHOD                  = MANAGER_ROOT + "." + "manager.ha.method";
    public static final String MANAGER_HEARBEAT_INTERVAL          = MANAGER_ROOT + "." + "manager.hearbeat.inverval.time";

    // scheduler
    public static final String MANAGER_SCHEDULER_POOL             = MANAGER_ROOT + "." + "manager.scheduler.pool";
    public static final String MANAGER_SCHEDULER_INTERVAL         = MANAGER_ROOT + "." + "manager.scheduler.inverval";
    public static final String MANAGER_SCHEDULER_EXECUTER_COUNT   = MANAGER_ROOT + "." + "manager.scheduler.executer.count";

    // task loader
    public static final String MANAGER_TASK_LOADER_HOST           = MANAGER_ROOT + "." + "manager.task.loader.host";
    public static final String MANAGER_TASK_LOADER_DATABASE       = MANAGER_ROOT + "." + "manager.task.loader.database";
    public static final String MANAGER_TASK_LOADER_USERNAME       = MANAGER_ROOT + "." + "manager.task.loader.username";
    public static final String MANAGER_TASK_LOADER_PASSWORD       = MANAGER_ROOT + "." + "manager.task.loader.password";
    public static final String MANAGER_TASK_LOADER_CHARSET        = MANAGER_ROOT + "." + "manager.task.loader.charset";

    // zk
    public static final String MANAGER_ZK_HOST                    = MANAGER_ROOT + "." + "manager.zk.host";
    public static final String MANAGER_ZK_PATH                    = MANAGER_ROOT + "." + "manager.zk.path";

    // mq
    public static final String MANAGER_MQ_TYPES                   = MANAGER_ROOT + "." + "manager.mq.types";
    public static final String MANAGER_MQ_PARTITIONS_COUNT        = MANAGER_ROOT + "." + "manager.mq.partitions.count";
    public static final String MANAGER_MQ_TOPIC                   = MANAGER_ROOT + "." + "manager.mq.topic";
    public static final String MANAGER_MQ_RETRICS                 = MANAGER_ROOT + "." + "manager.mq.retrics";
    public static final String MANAGER_MQ_MAX_REQUEST_SIZE        = MANAGER_ROOT + "." + "manager.mq.maxRequestSize";
    public static final String MANAGER_MQ_LINGERMS                = MANAGER_ROOT + "." + "manager.mq.lingerMs";
    public static final String MANAGER_MQ_BUFFER_MEMORY           = MANAGER_ROOT + "." + "manager.mq.bufferMemory";
    public static final String MANAGER_MQ_BATCH_SIZE              = MANAGER_ROOT + "." + "manager.mq.batchSize";
    public static final String MANAGER_MQ_GET_TIMEOUT             = MANAGER_ROOT + "." + "manager.mq.getTimeout";
    public static final String MANAGER_MQ_FLATMESSAGE             = MANAGER_ROOT + "." + "manager.mq.flatMessage";
    public static final String MANAGER_MQ_COMPRESSION_TYPE        = MANAGER_ROOT + "." + "manager.mq.compressionType";
    public static final String MANAGER_MQ_ACKS                    = MANAGER_ROOT + "." + "manager.mq.acks";
    public static final String MANAGER_MQ_PRODCER_GROUP           = MANAGER_ROOT + "." + "manager.mq.producerGroup";


}
