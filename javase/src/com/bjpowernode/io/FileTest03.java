package com.bjpowernode.io;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {

        File file = new File("D:/JavaProject/iodata");
        File[] fileList = file.listFiles();
        if (fileList.length != 0) {
            for (File item : fileList) {
                System.out.println(item.getName());
            }
        }


    }
}
