package com.somu.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main2 {
    // NOTE : WHAT IS YOU SERLIZED ONLY CHILD FIELD BUT WITH THE PARENT FIELD AS WELL SO WHAT WILL HAPPEN
   public static void main(String[] args)throws Exception {
        Dog2 d1 = new Dog2();

        d1.i = 100;
        d1.j = 200;

        System.out.println("SERIALIZATIION STARTED...");
        FileOutputStream fos = new FileOutputStream("Main2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d1);

        oos.close();
        fos.close();

        System.out.println("DESERIALIZATIION STARTED...");
        FileInputStream fis = new FileInputStream("Main2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog2 d2= (Dog2)ois.readObject();
        System.out.println(d2.i+" "+d2.j);
        ois.close();
        fis.close();

   }
}
