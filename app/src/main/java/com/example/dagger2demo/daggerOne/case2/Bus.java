package com.example.dagger2demo.daggerOne.case2;

/**
 * Description:
 * Created by FQH on 2019/10/17.
 */
public class Bus {
    private String driver;

    public Bus(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "driver='" + driver + '\'' +
                '}';
    }
}
