package com.bjpowernode.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {

        ObjectOutputStream oos = null;
        List<Student> studetList = new ArrayList<>();
        studetList.add(new Student(1, "zhansan"));
        studetList.add(new Student(2, "lisi"));
        studetList.add(new Student(3, "wangwu"));

        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:/JavaProject/iodata/students"));

            oos.writeObject(studetList);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
