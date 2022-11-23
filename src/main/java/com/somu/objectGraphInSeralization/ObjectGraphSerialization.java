package com.somu.objectGraphInSeralization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectGraphSerialization {
    public static void main(String[] args)throws Exception {
        
        Dog d1 = new Dog();

        // SERIALIZATION
        FileOutputStream fos = new FileOutputStream("ObjectGraphSerialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d1);

        oos.close();
        fos.close();

        // DESERIALIZATION

        FileInputStream fis = new FileInputStream("ObjectGraphSerialization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog d2 = (Dog)ois.readObject();

        System.out.println(d2);

        ois.close();
        fis.close();
    }
}
