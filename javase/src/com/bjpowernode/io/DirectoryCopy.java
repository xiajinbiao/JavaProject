package com.bjpowernode.io;

import java.io.*;

public class DirectoryCopy {
    public static void main(String[] args) {

        File file = new File("D:/JavaProject/iodata");
        System.out.println(file.getName());

        File destFile = new File("D:/JavaProject/IoDataCopy");
        if (!destFile.exists()) {
            destFile.mkdirs();
        }

        File[] fileList = file.listFiles();
        for(File item : fileList) {
            try {
                fileCopy(item.getAbsolutePath(), destFile.getAbsolutePath() + "/" + item.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(item.getName() + "复制完毕。");
        }

    }

    public static void fileCopy (String filePath, String destfile) throws IOException {

        FileInputStream in = new FileInputStream(filePath);
        FileOutputStream out = new FileOutputStream(destfile);

        byte[] bytes = new byte[in.available()];
        int readCount;
        while ((readCount = in.read(bytes)) != -1) {
            out.write(bytes, 0, readCount);
        }
        in.close();
        out.close();

    }
}
