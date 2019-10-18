package com.example.dagger2demo.daggerFour.case2;

import dagger.Subcomponent;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Subcomponent(modules = {ChildModule.class})
public interface ChildComponent {
    void inject(ChildActivity activity);

    @Subcomponent.Builder
    interface Builder {
        Builder setChildModule(ChildModule childModule);
        ChildComponent build();
    }
}
