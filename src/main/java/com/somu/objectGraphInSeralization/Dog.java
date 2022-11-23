package com.somu.objectGraphInSeralization;

import java.io.Serializable;

public class Dog implements Serializable{
    Cat c = new Cat();

    @Override
    public String toString() {
        return "Dog [c=" + c + "]";
    }

}
