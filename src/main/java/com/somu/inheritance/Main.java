package com.somu.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args)throws Exception {
        
        // NOTE : IF PARENT CLASS IMPLEMENTS SERIALIZABLE INTERFACE SO ALL CHILD CLASS ALSO BE SERIALIZABLE

        Dog1 d1 = new Dog1();

        FileOutputStream fos = new FileOutputStream("inheritance.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d1);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("inheritance.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog1 d2 = (Dog1)ois.readObject();
        System.out.println(d2.i+" "+d1.j);

        ois.close();
        fis.close();
    }
}
