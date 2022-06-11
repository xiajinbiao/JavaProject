package com.bjpowernode.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamTest04 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\JavaProject\\iodata\\temp");
            byte[] bytes = new byte[4];
            /*while (true) {
                int readCount = fis.read(bytes);
                if (readCount == -1) {
                    break;
                }
                System.out.print(new String(bytes, 0, readCount));
            }*/
            int readNum;
            while ((readNum = fis.read(bytes)) != -1) {
                // 读取到多少个转换多少个！
                System.out.print(new String(bytes, 0, readNum));
            }

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
