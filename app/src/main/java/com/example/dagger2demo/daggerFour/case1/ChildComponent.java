package com.example.dagger2demo.daggerFour.case1;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@SignLocal
@Component(modules = {ChildModule.class}, dependencies = FatherComponent.class)
public interface ChildComponent {
    void inject(ChildActivity activity);
}
