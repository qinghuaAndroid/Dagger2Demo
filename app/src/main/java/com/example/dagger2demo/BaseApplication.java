package com.example.dagger2demo;

import android.app.Application;
import android.content.Context;

import com.example.dagger2demo.daggerThree.case2.DaggerUserComponent;
import com.example.dagger2demo.daggerThree.case2.UserComponent;
import com.example.dagger2demo.daggerThree.case2.UserModule;
import com.example.dagger2demo.daggerThree.case3.DaggerParkingComponent;
import com.example.dagger2demo.daggerThree.case3.ParkingComponent;
import com.example.dagger2demo.daggerThree.case3.ParkingModule;

/**
 * Description:
 * Created by FQH on 2019/10/18.
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initParkingComponent();
    }

    /*************************************************************************/
    //DaggerThreeCase2
    UserComponent userComponent;

    public void initUserComponent(String name) {
        userComponent = DaggerUserComponent.builder().userModule(new UserModule(name)).build();
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }

    public void releaseUserComponent() {
        userComponent = null;
    }

    /*************************************************************************/
    //DaggerThreeCase3
    ParkingComponent parkingComponent;

    private void initParkingComponent() {
        parkingComponent = DaggerParkingComponent.builder().parkingModule(new ParkingModule("波が多い")).build();
    }

    public ParkingComponent getParkingComponent() {
        return parkingComponent;
    }

    /*************************************************************************/

    public static BaseApplication getApplication(Context context) {
        return (BaseApplication) context.getApplicationContext();
    }

}
