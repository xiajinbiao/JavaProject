package com.bjpowernode.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {

        FileInputStream fis = null;

//        FileInputStream fis = new FileInputStream("D:\\JavaProject\\iodata\\temp");

        try {
            fis = new FileInputStream("D:/JavaProject/iodata/temp");
            int temp = fis.read();
            System.out.println(temp);

            temp = fis.read();
            System.out.println(temp);

            temp = fis.read();
            System.out.println(temp);

            temp = fis.read();
            System.out.println(temp);

            temp = fis.read();
            System.out.println(temp);

            temp = fis.read();
            System.out.println(temp);
            // 文件读取完毕，返回负一。
            temp = fis.read();
            System.out.println(temp);

            temp = fis.read();
            System.out.println(temp);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }
}
