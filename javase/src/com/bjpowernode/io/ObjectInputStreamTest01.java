package com.bjpowernode.io;

import java.io.*;

public class ObjectInputStreamTest01 {
    public static void main(String[] args) {

        ObjectOutputStream ois = null;
        try {
            ois = new ObjectOutputStream(new FileOutputStream("D:/JavaProject/iodata/student"));

            Student studet = new Student(1, "zhangsan");
            ois.writeObject(studet);

            Student studet1 = new Student(2, "lisi");
            ois.writeObject(studet1);

            ois.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
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
