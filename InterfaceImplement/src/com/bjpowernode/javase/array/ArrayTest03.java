package com.bjpowernode.javase.array;

public class ArrayTest03 {
    public static void main(String[] args) {

        System.out.println(args.length);
        System.out.println("=====================");
        printArray(new int[2]);
        System.out.println("=====================");
        printArray(new int[]{1, 2, 3});
        System.out.println("=====================");
        int[] array = {4, 5, 6};
        printArray(array);

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
