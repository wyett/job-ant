package com.wyett.jobant.register.entries;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/20 16:40
 * @description: TODO
 */

public class NodeIdentity<T> implements Serializable {
    private static final long serialVersionUID = 2539353635028164434L;

    private String host;
    private String port;
    private T context;
}
