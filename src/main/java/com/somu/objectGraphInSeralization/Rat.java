package com.somu.objectGraphInSeralization;

import java.io.Serializable;

public class Rat implements Serializable{
    int j = 20;

    @Override
    public String toString() {
        return "Rat [j=" + j + "]";
    }

}
