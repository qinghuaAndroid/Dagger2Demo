package com.example.dagger2demo.daggerTwo.case3;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Sign {
    String value() default "";
}
