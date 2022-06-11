package com.bjpowernode.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {

        FileReader reader = null;

        try {
            reader = new FileReader("D:\\JavaProject\\iodata\\temp");
            char[] chars = new char[4];

            int readCount;
            while ((readCount = reader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
