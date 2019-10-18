package com.example.dagger2demo.daggerThree.case2;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@UserScope
@Component(modules = {UserModule.class})
public interface UserComponent {
    void inject(LoginActivity loginActivity);
    void inject(TestActivity testActivity);
}
