package com.wyett.jobant.common.entry;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/21 15:47
 * @description: TODO
 */

public class HeartbeatEntry<T> {
    private String host;
    private int port;
    private String serverName;
    private T context;
}
