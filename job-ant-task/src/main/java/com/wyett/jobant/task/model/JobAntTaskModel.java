package com.wyett.jobant.task.model;

import java.util.LinkedList;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/19 17:28
 * @description: TODO
 */

public class JobAntTaskModel<T> {
    private long length;
    private long mainId;
    private LinkedList<T> tasks;
}
