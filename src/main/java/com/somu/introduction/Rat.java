package com.somu.introduction;

import java.io.Serializable;

public class Rat implements Serializable {
    private String name;
    private String color;

    public Rat(String n, String c)
    {
        this.name = n;
        this.color = c;
    }

    @Override
    public String toString() {
        return "Rat [name=" + name + ", color=" + color + "]";
    }
}
