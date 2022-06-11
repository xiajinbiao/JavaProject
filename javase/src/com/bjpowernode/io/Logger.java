package com.bjpowernode.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void log(String s) {

        try {
            PrintStream out = new PrintStream(new FileOutputStream("D:/JavaProject/iodata/temp.txt", true));
            System.setOut(out);

            Date currentTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String time = sdf.format(currentTime);

            System.out.println(time + ":" + s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
