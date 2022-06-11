package com.bjpowernode.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputStreamTest02 {
    public static void main(String[] args) {

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("D:/JavaProject/iodata/students"));
            /*Object obj = ois.readObject();
            System.out.println(obj);*/

            ArrayList<Student> studetArrayList = (ArrayList<Student>) ois.readObject();
            for (Student student : studetArrayList) {
                System.out.println(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
