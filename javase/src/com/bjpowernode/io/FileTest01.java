package com.bjpowernode.io;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {

//        File file = new File("D:/JavaProject/iodata/a");
        // 判断路劲是否存在，如果不存在，则以文件的形式新建。
        /*if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        // 判断路径是否存在，如果不存在，则新建路径（只能新建一级路径）
        /*File file2 = new File("D:/JavaProject/iodata/a");
        if (!file2.exists()) {
            file2.mkdir();
        }*/

        // 判断路径是否存在，如果不存在，则新建路径（可以新建多级路径）
        /*File file3 = new File("D:/JavaProject/iodata/c");

        if (!file3.exists()) {
            file3.mkdirs();
        }*/


        File file4 = new File("D:/JavaProject/iodata/temp.txt");
        // 获取文件路径，返回值类型是String
        System.out.println(file4.getPath());
        // 获取文件的上一级路径，返回值类型是String
        System.out.println(file4.getParent());
        // 获取文件的上一级路径，但是返回值类型是File
        System.out.println(file4.getParentFile().getAbsolutePath());
        // 获取文件的绝对路径
        System.out.println(file4.getAbsolutePath());
    }
}
