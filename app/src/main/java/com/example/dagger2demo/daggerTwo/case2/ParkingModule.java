package com.example.dagger2demo.daggerTwo.case2;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Module
public class ParkingModule {

    @Provides
    @Sign
    public Bus providerBus() {
        return new Bus();
    }

    @Provides
    @Sign(driver = "hello")
    public Bus providerBusHasDriver() {
        return new Bus("hello,树先生！");
    }
}
