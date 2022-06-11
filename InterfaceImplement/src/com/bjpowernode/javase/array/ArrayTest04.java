package com.bjpowernode.javase.array;

public class ArrayTest04 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("您输入的账号或密码有误");
            System.exit(0);
        }
//        if (args[0].equals("zhangsan") && args[1].equals("123456"))
        if ("zhangsan".equals(args[0]) && "123456".equals(args[1])){
            System.out.println("登录成功");
        }else {
            System.out.println("账号或者密码错误");
            System.exit(0);
        }

    }
}
