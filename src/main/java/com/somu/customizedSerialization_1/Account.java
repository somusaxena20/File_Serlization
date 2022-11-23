package com.somu.customizedSerialization_1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
    String username;
    transient String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // SO INSTED OF THAT WRITE METHOD JVM CALL IS WRITE OBJECT METHOD TO PERFORM CUSTOMIZED SERLIZATION
    private void writeObject(ObjectOutputStream os)throws Exception
    {
        // USING DEFAULT SERLIZATION
        os.defaultWriteObject();

        // EXTRA WORK ENCRYPT THE PASSWORD
        String epwd = "123"+password;
        os.writeObject(epwd);

    }

    private void readObject(ObjectInputStream is)throws Exception
    {
        // USING DEFAULT DESERLIZATION
        is.defaultReadObject();

        // EXTRA WORK FOR DECRIPTION
        String epwd = (String)is.readObject();

        String dpwd = epwd.substring(3);
        this.password = dpwd;
    }

    @Override
    public String toString() {
        return "Account [username=" + username + ", password=" + password + "]";
    }

}
