package com.bjpowernode.io;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) {

        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\JavaProject\\iodata\\temp", true)));
            out.write("我是一个中国人");
            out.write("我是一个中国人");
            out.write("我是一个中国人");
            out.write("我是一个中国人");
            out.write("我是一个中国人");

            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
