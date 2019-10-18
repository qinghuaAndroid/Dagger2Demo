package com.example.dagger2demo.daggerThree.case1;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@SignLocal
@Component(modules = {ParkingModule.class})
public interface ParkingComponent {
    void inject(ParkingActivity parkingActivity);
}
