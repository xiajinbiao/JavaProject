package com.bjpowernode.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy01 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\win猫头鹰壁纸\\surface猫头鹰壁纸[1].png");
            fos = new FileOutputStream("D:\\surface猫头鹰壁纸[1].png");
            // 定义一兆大小的缓冲区
            byte[] butes = new byte[1024 * 1024];

            int readCount;
            while ((readCount = fis.read(butes)) != -1) {
                fos.write(butes, 0, readCount);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 这里分别关闭读取流和写入流，防止某个流出问题，使得另一个流无法关闭。
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
