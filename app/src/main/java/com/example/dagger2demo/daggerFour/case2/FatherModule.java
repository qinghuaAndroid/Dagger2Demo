package com.example.dagger2demo.daggerFour.case2;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Module(subcomponents = ChildComponent.class)
public class FatherModule {

    private String name;

    public FatherModule(String name) {
        this.name = name;
    }

    @Provides
    public Father providerFather() {
        return new Father(name);
    }
}
