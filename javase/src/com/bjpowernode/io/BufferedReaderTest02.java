package com.bjpowernode.io;

import java.io.*;
/*
* FileInputStream是字节流
* InputStreamReader（OutputStreamReader）可以将字节流转换为字符流
* BufferedReader的构造方法中只能接收字符流
* */
public class BufferedReaderTest02 {
    public static void main(String[] args) {

        FileInputStream in;
        InputStreamReader reader;
        BufferedReader br = null;
        try {
            in = new FileInputStream("D:\\JavaProject\\iodata\\temp");
            // 这里in是字节流，reader是包装流。
            reader = new InputStreamReader(in);
            // 这里reader是字节流，br是包装流。
            br = new BufferedReader(reader);

            // br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JavaProject\\iodata\\temp")));


            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭的时候，只需呀关闭最外层。
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
