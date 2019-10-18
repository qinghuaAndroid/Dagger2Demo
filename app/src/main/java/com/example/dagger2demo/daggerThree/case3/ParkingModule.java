package com.example.dagger2demo.daggerThree.case3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Module
public class ParkingModule {

    private String driver;

    public ParkingModule(String driver) {
        this.driver = driver;
    }

    @Provides
    public String providerDriver() {
        return driver;
    }

    @Singleton
    @Provides
    public Bus providerBus() {
        return new Bus(driver);
    }
}
