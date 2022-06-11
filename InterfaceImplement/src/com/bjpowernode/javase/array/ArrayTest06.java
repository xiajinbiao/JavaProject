package com.bjpowernode.javase.array;

public class ArrayTest06 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[5];
        System.arraycopy(array1, 1, array2, 2, 3);
        for (int i: array2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("===================");
        for (int i : array1) {
            System.out.print(i + " ");
        }
    }
}
