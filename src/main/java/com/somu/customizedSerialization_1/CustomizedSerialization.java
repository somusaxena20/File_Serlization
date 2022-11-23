package com.somu.customizedSerialization_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerialization {
    public static void main(String[] args)throws Exception {

        // THE MAIN USE OF CUSTOMIZED SERIALIZATION IS TO RECOVER THE LOST OF INFORMATION DURING THE SERLIZATION BY TRANSIENT KEYWORD
        
        Account a1 = new Account("Durga", "Anushka");

        FileOutputStream fos = new FileOutputStream("CustomizedSerlization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a1);

        System.out.println(a1);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("CustomizedSerlization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // HERE WE LOST THE INFORMATION ABOUT THAT PASSWORD FIELD SO FOR RECOVER THAT WE USE CUSTOMIZED SERLIZATION

        Account a2 = (Account)ois.readObject();
        System.out.println(a2);

        ois.close();
        fis.close();
    }
}
