package com.example.dagger2demo.daggerFour.case1;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Singleton
@Component(modules = {FatherModule.class})
public interface FatherComponent {
    Father offerFather();
}
