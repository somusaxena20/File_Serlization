package com.somu.serialversionUID;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {
    public static void main(String[] args)throws Exception {
        
        Dog d1 = new Dog();
        
        FileOutputStream fos = new FileOutputStream("SerialversionUID.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d1);

        oos.close();
        fos.close();
    }
}
