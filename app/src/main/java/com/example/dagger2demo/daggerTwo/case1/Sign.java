package com.example.dagger2demo.daggerTwo.case1;

import javax.inject.Qualifier;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Qualifier
public @interface Sign {
    String value() default "";
}
