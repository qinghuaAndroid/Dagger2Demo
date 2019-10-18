package com.example.dagger2demo.daggerFour.case2;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Module
public class ChildModule {
    private String name;

    public ChildModule(String name) {
        this.name = name;
    }

    @Provides
    public String providerName() {
        return name;
    }

    @Provides
    public Child providerChild(Father father, String name) {
        return new Child(father, name);
    }
}
