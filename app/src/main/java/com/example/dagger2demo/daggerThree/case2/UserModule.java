package com.example.dagger2demo.daggerThree.case2;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Module
public class UserModule {

    private String name;

    public UserModule(String name) {
        this.name = name;
    }

    @Provides
    public String providerName() {
        return name;
    }

    @UserScope
    @Provides
    public User providerUser() {
        return new User(name);
    }

}
