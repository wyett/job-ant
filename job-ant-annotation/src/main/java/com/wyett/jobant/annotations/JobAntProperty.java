package com.wyett.jobant.annotations;

import java.lang.annotation.*;

/**
 * @author : wyettLei
 * @date : Created in 2021/1/16 18:54
 * @description: TODO
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({})
public @interface JobAntProperty {
    /**
     * Returns the property name.
     *
     * @return the property name
     */
    String name();

    /**
     * Returns the property value or placeholder.
     *
     * @return the property value or placeholder
     */
    String value();
}

