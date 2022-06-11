package com.bjpowernode.javase;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {1, 300, 4, 50, 29, 121, 444};
        int returnValue = binarySelect(array, 300);
        System.out.println(returnValue);

    }
    public static int binarySelect(int[] array, int dest){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
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
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        int begin = 0;
        int end = array.length - 1;
        while (begin <= end){
            int mid = (begin + end) / 2;
            if (array[mid] == dest){
                return mid;
            }else if (array[mid] < dest){
                begin ++;
            }else {
                end --;
            }
        }
        return -1;
    }
}
