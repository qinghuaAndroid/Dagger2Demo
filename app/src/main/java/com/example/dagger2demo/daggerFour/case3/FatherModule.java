package com.example.dagger2demo.daggerFour.case3;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/5/17.
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

    @Provides
    public Father provideFather() {
        return new Father(name);
    }
}