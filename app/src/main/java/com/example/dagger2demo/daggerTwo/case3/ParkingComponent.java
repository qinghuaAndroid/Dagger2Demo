package com.example.dagger2demo.daggerTwo.case3;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Component(modules = {ParkingModule.class})
public interface ParkingComponent {
    void inject(ParkingActivity parkingActivity);
}
