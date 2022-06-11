package com.bjpowernode.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy02 {
    public static void main(String[] args) {

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("D:\\JavaProject\\iodata\\temp");
            writer = new FileWriter("D:/temp");

            char[] chars = new char[256];
            int readCount;
            while ((readCount = reader.read(chars)) != -1) {
                writer.write(chars, 0, readCount);
            }



            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
