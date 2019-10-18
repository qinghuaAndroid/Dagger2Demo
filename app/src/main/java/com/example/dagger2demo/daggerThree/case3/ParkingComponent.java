package com.example.dagger2demo.daggerThree.case3;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Singleton
@Component(modules = {ParkingModule.class})
public interface ParkingComponent {
    void inject(ParkingActivity parkingActivity);
    void inject(TestActivity testActivity);
}
