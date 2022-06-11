package com.bjpowernode.map;

import java.util.Properties;

public class PropertiesReview {
    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.setProperty("username", "zhansan");
        properties.setProperty("password", "12345");

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

//        Object username1 = properties.get("username");

        System.out.println("username: " + username);
        System.out.println("password: " + password);


    }
}
