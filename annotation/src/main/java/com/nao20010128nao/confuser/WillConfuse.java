package com.nao20010128nao.confuser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Modifier;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface WillConfuse {
    int modifier() default Modifier.PUBLIC;
    int nest() default -1;
    String value();
    boolean printNest() default false;
    String randomSeed() default "";
}
