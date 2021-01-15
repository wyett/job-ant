package com.wyett.jobant.common.log;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 17:09
 * @description: TODO
 */

public interface JobAntLog {

    boolean isDebugEnabled();

    boolean isTraceEnabled();

    void error(String s, Throwable e);

    void error(String s);

    void debug(String s);

    void trace(String s);

    void warn(String s);
}
