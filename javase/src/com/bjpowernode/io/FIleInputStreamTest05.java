package com.bjpowernode.io;

/*
* fis.available()用来获取文件中共有多少个可读的字节数。
* 利用该函数的返回值可以用来定义缓冲区的大小。
* 但是该方法不适合读取较大的文件，因为byte[]数组的大小不能太大。
* */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamTest05 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\JavaProject\\iodata\\temp");
            byte[] bytes = new byte[fis.available()];
            /*System.out.println("一共可读的字节数：" + fis.available());

            int readNum = fis.read(bytes);
            System.out.println("当前读到的字节数：" + readNum);
            System.out.println(new String(bytes));
            // ???????????????????这里为什么不相等
            System.out.println(readNum == fis.available());*/

            // 跳过n个字节不读取。
            fis.skip(5);
            System.out.println(fis.read());


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
