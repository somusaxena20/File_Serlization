package com.somu.inheritance;

import java.io.Serializable;

// CASE 1 : WHEN ONLY PARENT CLASS IMPLEMENT SERIALIZABLE
public class Animal1 implements Serializable {
    int i = 10;

    @Override
    public String toString() {
        return "Animal [i=" + i + "]";
    }

}


