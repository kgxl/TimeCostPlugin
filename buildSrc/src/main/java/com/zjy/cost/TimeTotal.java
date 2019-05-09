package com.zjy.cost;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by com.com.zjy on 2019-05-03
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface TimeTotal {
}
