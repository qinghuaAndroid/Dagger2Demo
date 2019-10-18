package com.example.dagger2demo.daggerOne.case1;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/17.
 */
@Component
public interface ParkingComponent {

    void inject(ParkingActivity parkingActivity);
}
