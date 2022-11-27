package com.somu.inheritance;

import java.io.Serializable;

public class Dog2 extends Animal2 implements Serializable{
    int j = 20;

    public Dog2()
    {
        System.out.println("Dog contructor called...");
    }
}
