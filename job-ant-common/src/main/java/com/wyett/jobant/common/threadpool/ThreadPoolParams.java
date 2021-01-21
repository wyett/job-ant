package com.wyett.jobant.common.threadpool;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/20 17:53
 * @description: TODO
 */


import java.util.concurrent.BlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;


public class ThreadPoolParams {

    private int corePoolSize;
    private int maximumPoolSize;
    private long keepAliveTime;
    private TimeUnit unit = TimeUnit.MILLISECONDS;
    private BlockingDeque workQueue;
    private ThreadFactory threadFactory;
    private RejectedExecutionHandler handler;
}
