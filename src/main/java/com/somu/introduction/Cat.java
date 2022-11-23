package com.somu.introduction;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String color;

    public Cat(String n, String c) {
        this.name = n;
        this.color = c;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", color=" + color + "]";
    }

}
