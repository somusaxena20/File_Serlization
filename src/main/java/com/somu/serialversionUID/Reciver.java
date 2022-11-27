package com.somu.serialversionUID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Reciver {
    public static void main(String[] args)throws Exception {
        
        FileInputStream fis = new FileInputStream("SerialversionUID.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog obj = (Dog)ois.readObject();
        System.out.println(obj.i +" "+obj.j);

        ois.close();
        fis.close();
    }
}
 