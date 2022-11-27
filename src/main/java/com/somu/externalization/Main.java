package com.somu.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args)throws Exception {
        
        ExternalizableDemo obj = new ExternalizableDemo("SOMU", 22, 2000);

        FileOutputStream fos = new FileOutputStream("Externalization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(obj);
        System.out.println(obj);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("Externalization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ExternalizableDemo obj1 = (ExternalizableDemo)ois.readObject();
        System.out.println(obj1);


        ois.close();
        fis.close();
    }
}
