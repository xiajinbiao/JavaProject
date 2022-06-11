package com.bjpowernode.io;

import java.io.DataInput;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {

        File f1 = new File("D:/JavaProject/iodata/temp.txt");
        // 获取文件名
        System.out.println("文件名：" + f1.getName());
        // 判断是否为路径
        System.out.println("是否为路径：" + f1.isDirectory());
        // 判断是否为文件
        System.out.println("是否为文件：" + f1.isFile());
        // 查看最后的修改时间，返回值是从1970年1月1日到最后修改日期的毫秒数
        Long time = f1.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
        String strTime = sdf.format(date);
        System.out.println(strTime);
        // 获取文件大小（字节数）
        Long length = f1.length();
        System.out.println(length);
    }
}
