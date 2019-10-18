package com.example.dagger2demo.daggerTwo.case2;

import javax.inject.Qualifier;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Qualifier
public @interface Sign {
    String driver() default "";
}
