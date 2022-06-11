package com.bjpowernode.javase;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 1, 4, 9, 0, 5, 3, 1, 5};
        int[] returnValue = SelectSort.sort(array);
        for (int i = 0; i < returnValue.length; i++) {
            System.out.println(returnValue[i]);
        }

    }
    public static int[] sort(int[] array){
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {
            int station = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[station]) {
                    station = j;
                }
            }
            if (station != i){
                min = array[station];
                array[station] = array[i];
                array[i] = min;
            }
        }
        return array;
    }
}