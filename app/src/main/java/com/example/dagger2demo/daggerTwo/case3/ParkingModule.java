package com.example.dagger2demo.daggerTwo.case3;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
@Module
public class ParkingModule {

    @Provides
    @Sign("xiaoli")
    public Bus providerBusHasDriver(@Sign("xl") String driver) {
        return new Bus(driver);
    }

    @Sign("xl")
    @Provides
    public String providerDriverW() {
        return "楼下小李";
    }
}
