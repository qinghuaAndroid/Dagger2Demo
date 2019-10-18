package com.example.dagger2demo.daggerFour.case2;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Component(modules = {FatherModule.class})
public interface FatherComponent {
    ChildComponent.Builder buildChildComponent();
}
