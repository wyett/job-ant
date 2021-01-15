package com.wyett.jobant.common;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/15 15:31
 * @description: TODO
 */

public class JobAntException extends RuntimeException {

    private static final long serialVersionUID = 4452141185246445600L;

    public JobAntException(String errorCode){
        super(errorCode);
    }

    public JobAntException(String errorCode, Throwable cause){
        super(errorCode, cause);
    }

    public JobAntException(String errorCode, String errorDesc){
        super(errorCode + ":" + errorDesc);
    }

    public JobAntException(String errorCode, String errorDesc, Throwable cause){
        super(errorCode + ":" + errorDesc, cause);
    }

    public JobAntException(Throwable cause){
        super(cause);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
