package com.example.dagger2demo.daggerOne.case2;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/17.
 */
@Component(modules = {ParkingModule.class})
public interface ParkingComponent {
    void inject(ParkingActivity parkingActivity);
}
