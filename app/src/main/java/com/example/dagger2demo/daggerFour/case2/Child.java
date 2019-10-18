package com.example.dagger2demo.daggerFour.case2;

/**
 * Created by Mr.T on 2018/5/17.
 */

public class Child {

    Father father;
    String name;

    public Child(Father father, String name) {
        this.father = father;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Child{" +
                "father=" + father +
                ", name='" + name + '\'' +
                '}';
    }
}
