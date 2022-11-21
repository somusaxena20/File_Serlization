package com.somu.introduction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerlizationDemo {
    public static void main(String[] args) throws Exception {
//        CREATING OBJECT OF DOG
        Dog dog1 = new Dog("Tommy", "Black");

//        SERIALIZATION

        FileOutputStream fos = new FileOutputStream("SerlizationDemo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(dog1);

//        CLOSING RESOURCE
        oos.close();
        fos.close();

//        DESERIALIZATION

        FileInputStream fis = new FileInputStream("SerlizationDemo.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog dog2 = (Dog) ois.readObject();
//        CLOSING RESOURCE
        ois.close();
        fis.close();

        System.out.println(dog1 + " " + dog2);
        System.out.println(dog1 == dog2);
    }
}
