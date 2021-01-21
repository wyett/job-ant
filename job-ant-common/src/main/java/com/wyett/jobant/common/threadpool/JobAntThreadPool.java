package com.wyett.jobant.common.threadpool;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/20 17:12
 * @description: TODO
 */

public class JobAntThreadPool<T> {

    //private final ThreadPoolExecutor executors = new ScheduledThreadPoolExecutor()

    // 阻塞队列
    private final Queue<T> jobAntList = new LinkedBlockingQueue<T>();

    // 线程
    private Integer maxThreadNum;
    private Integer minThreadNum;


}
