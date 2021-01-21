package com.wyett.jobant.register.entries;

import java.util.Map;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 16:13
 * @description: node register, T is Type of Node
 */

public class RegisterEntry<T> {
    private String host;
    private String port;
    private T content;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
