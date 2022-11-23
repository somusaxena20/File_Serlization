package com.somu.introduction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerlizationDemo2 {
    public static void main(String[] args) throws Exception {

        // STORING MULTIPLE OBJECT USING SERIALIZATION

        Dog d1 = new Dog("Juli", "White");
        Cat c1 = new Cat("Kiti", "Black");
        Rat r1 = new Rat("chuichui", "Black");

        // SERIALIZATION

        FileOutputStream fos = new FileOutputStream("SerlizationDemo2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d1);
        oos.writeObject(c1);
        oos.writeObject(r1);

        oos.close();
        fos.close();

        // DESERIALIZATION

        // FileInputStream fis = new FileInputStream("SerlizationDemo2.txt");
        // ObjectInputStream ois = new ObjectInputStream(fis);

        // Dog d2 = (Dog)ois.readObject();
        // Cat c2 = (Cat)ois.readObject();
        // Rat r2 = (Rat)ois.readObject();

        // System.out.println(d2 +" "+c2+" "+r2);

        // ois.close();
        // fis.close();

        // WHAT IF YOU DON'T KNOW ORDER OR OBJECT YOU CAN DO THIS

        FileInputStream fis = new FileInputStream("SerlizationDemo2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = null;

        while (fis.available() > 0) {

            obj = ois.readObject();

            if (obj instanceof Dog) {
                System.out.println(obj);
            } else if (obj instanceof Cat) { 
                System.out.println(obj);
            } else if (obj instanceof Rat) {
                System.out.println(obj);
            } else {
                System.out.println("Object Not Specified...");
            }
            
        }

        ois.close();
        fis.close();
    }
}
