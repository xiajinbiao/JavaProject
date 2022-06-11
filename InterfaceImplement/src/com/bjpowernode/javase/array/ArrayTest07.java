package com.bjpowernode.javase.array;

import java.util.zip.DeflaterOutputStream;

public class ArrayTest07 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4},
                {4, 5, 6},
                {7, 8}
        };
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            System.out.println("===================");
        }
        /*System.out.println("============");
//        int[] array1 = new int[array[0].length];
        int[] array1;
        array1 = array[0];
        for (int i : array1){
            System.out.println(i);
        }*/

        /*System.out.println("======================");
        int[][] array1 = new int[2][3];
        System.out.println(array1.length);
        System.out.println(array1[1].length);*/

    }
}
