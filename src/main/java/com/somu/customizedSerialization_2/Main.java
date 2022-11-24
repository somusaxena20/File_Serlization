package com.somu.customizedSerialization_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args)throws Exception {
        
        Account a1 = new Account("Durga", "Ansushka", 1234);

        FileOutputStream fos = new FileOutputStream("CustomizedSerialization2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(a1);
        System.out.println(a1);
        
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("CustomizedSerialization2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object a2 = (Account)ois.readObject();
        System.out.println(a2);

        ois.close();
        fis.close();
    }
}
