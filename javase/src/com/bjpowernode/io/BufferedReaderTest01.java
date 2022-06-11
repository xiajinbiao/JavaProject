package com.bjpowernode.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {

        // 节点流
        FileReader reader;
        // 处理流/包装流
        BufferedReader br = null;
        try {
            reader = new FileReader("D:\\JavaProject\\iodata\\temp");
            br = new BufferedReader(reader);

            /*String firstLine = br.readLine();
            System.out.println(firstLine);*/
            // readLine()读取的时候，不会读取换行符。
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 只需要关闭包装流/处理流（构造函数中的字节流不需要处理）
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
