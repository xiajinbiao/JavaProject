package com.bjpowernode.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OblectInputStreamTest01 {
    public static void main(String[] args) {

        ObjectInputStream ois = null;
        try {
             ois = new ObjectInputStream(new FileInputStream("D:/Javaproject/iodata/student"));
             // 按写入的顺序依次读取
             Object obj = ois.readObject();
             System.out.println(obj);
             Object obj1 = ois.readObject();
             System.out.println(obj1);

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
