package com.somu.customizedSerialization_2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
    String username;
    transient String password;
    transient int pin;

    public Account(String username, String password, int pin) {
        this.username = username;
        this.password = password;
        this.pin = pin;
    }

    private void writeObject(ObjectOutputStream os)throws Exception
    {
        os.defaultWriteObject();

        String epwd = "123"+this.password;
        os.writeObject(epwd);

        int epin = 1000+this.pin;
        os.writeInt(epin);
    }

    private void readObject(ObjectInputStream is)throws Exception
    {
        is.defaultReadObject();

        String epwd = (String)is.readObject();
        this.password = epwd.substring(3);

        int epin = is.readInt();
        this.pin = epin-1000;
    }



    @Override
    public String toString() {
        return "Account [username=" + username + ", password=" + password + ", pin=" + pin + "]";
    }

}
