package com.example.dagger2demo.daggerOne.case2;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/17.
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

    @Provides
    public Bus providerBus() {
        return new Bus(driver);
    }
}
