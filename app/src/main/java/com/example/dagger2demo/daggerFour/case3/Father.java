package com.example.dagger2demo.daggerFour.case3;

/**
 * Created by Mr.T on 2018/5/17.
 */

public class Father {

    String name;

    public Father(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }
}