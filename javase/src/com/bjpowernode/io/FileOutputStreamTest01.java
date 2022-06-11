package com.bjpowernode.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {

        FileOutputStream fos = null;

        try {
            // 文件不存在的时候会自动新建。
            // 清空源文件然后写入，慎用。
            fos = new FileOutputStream("D:/JavaProject/iodata/tempfile_all.txt");
            // 开始写入
            byte[] bytes = {97, 98, 99, 100};
            // 以清空的方式写入。
            fos.write(bytes);
            // 写入结束
            fos.flush();

            fos = new FileOutputStream("D:/JavaProject/iodata/tempfile_part.txt");
            fos.write(bytes, 1, 2);
            fos.flush();

            // 以追加的方式写入。
            fos = new FileOutputStream("D:/JavaProject/iodata/tempfile_part.txt", true);
            fos.write(bytes);
            String s = "我是一个中国人";
            byte[] temp = s.getBytes();
            for (byte item : temp) {
                System.out.println(item);
            }
            fos.write(temp);
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
