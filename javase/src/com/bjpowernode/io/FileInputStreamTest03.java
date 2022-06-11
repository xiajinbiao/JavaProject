package com.bjpowernode.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\JavaProject\\iodata\\temp");
            byte[] readData = new byte[4];
            // 返回值是读取到的字节数，如果没有读取到，则返回-1.
            int totalNum = fis.read(readData);
            System.out.println(totalNum);
//            System.out.println(new String(readData));
            System.out.println(new String(readData, 0, totalNum));

            System.out.println("-----------------------------------");

            /*System.out.println(totalNum);
            for (byte item : readData) {
                System.out.println(item);
            }*/
            totalNum = fis.read(readData);
            System.out.println(totalNum);
//            System.out.println(new String(readData));
            System.out.println(new String(readData, 0, totalNum));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
