package com.example.dagger2demo.daggerTwo.case1;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Module
public class ParkingModule {

    @Provides
    @Sign("noDriver")
    public Bus providerBus() {
        return new Bus();
    }

    @Provides
    @Sign("laowang")
    public Bus providerBusHasDriver() {
        return new Bus("隔壁老王");
    }
}
