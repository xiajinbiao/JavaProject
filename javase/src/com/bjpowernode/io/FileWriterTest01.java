package com.bjpowernode.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {

        FileWriter writer = null;

        try {
            // 写入的文件不存在，会自动新建。
            writer = new FileWriter("D:\\JavaProject\\iodata\\temp", true);

            // 写入的时候，可以加一个字符数组，也可以是字符数组的一部分，也可以是一个字符串。
            char[] chars = {'中', '国', '中', '国','中', '国','中', '国','中', '国','中', '国'};
            writer.write(chars, 3, 5);
            writer.write("zhongguoren");

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
