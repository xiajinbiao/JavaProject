package com.bjpowernode.javase.array;

import java.lang.reflect.Array;

public class ArrayTest02 {
    public static void main(String args[]) {
        System.out.println("Hello Word!!");

        int[] a1 = {1, 2, 3};
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        int a2[] = {4, 5, 6};
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
        ArrayTest02 arrayTest1 = new ArrayTest02();
        arrayTest1.printArray(a1);
        ArrayTest02 arrayTest2 = new ArrayTest02();
        arrayTest2.printArray(a2);

    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
