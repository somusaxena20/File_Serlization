package com.somu.introduction;

import java.io.Serializable;

public class Dog implements Serializable {
    // TRANSIENT KEYWORD : USING THIS YOU CAN HIDE SENSITIVE DATA TO STORE IN FILE

    // HERE I'M HIDING MY DOG NAME SO NO ONE CAN CALL HIM TO HIS SIDE 😅
    // transient static String name;
    String name;
    String color;

    public Dog(String name, String color) {

        System.out.println("Inside Args Const...");
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", color=" + color + "]";
    }

}
