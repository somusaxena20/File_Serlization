package com.somu.objectGraphInSeralization;

import java.io.Serializable;

public class Cat implements Serializable{
    Rat r = new Rat();

    @Override
    public String toString() {
        return "Cat [r=" + r + "]";
    }

}
