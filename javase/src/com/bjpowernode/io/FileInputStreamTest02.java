package com.bjpowernode.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("D:\\JavaProject\\iodata\\temp");
            /*while (true) {
                int temp = fis.read();
                if (temp == -1) {
                    break;
                }
                System.out.println(temp);
            }*/
            System.out.println("-----------------------------------------");
            int temp1;
            while ((temp1 = fis.read()) != -1) {
                System.out.println(temp1);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally{
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
