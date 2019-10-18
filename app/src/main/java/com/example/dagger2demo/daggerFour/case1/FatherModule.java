package com.example.dagger2demo.daggerFour.case1;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Module
public class FatherModule {

    private String name;

    public FatherModule(String name) {
        this.name = name;
    }

    @Provides
    public String providerName() {
        return name;
    }

    @Singleton
    @Provides
    public Father providerFather() {
        return new Father(name);
    }
}
