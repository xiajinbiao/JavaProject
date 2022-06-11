package com.bjpowernode.javase.array;

import java.lang.reflect.Array;

/*
    java中数组是一种引用数据类型，其父类是Object
    数组是一个容器，可以同时容纳多个元素

 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] array1 = {100, 200 ,300};
        int[] array2 = new int[5];
        System.out.println(array1[2]);
        System.out.println(array1.length);
        array1[1] = 111;
        System.out.println(array1[1]);
//        array1[-1] = 0;
//        System.out.println(array1[array1.length - 1]);
        for (int i=0; i<array1.length; i++) {

            System.out.println(array1[i]);
        }

    }
}
