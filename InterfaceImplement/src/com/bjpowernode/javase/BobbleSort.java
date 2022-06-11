package com.bjpowernode.javase;

public class BobbleSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 6, 8, 0, 3, 5, 6, 18};
        int[] resultValue = BobbleSort.sort1(array);
        for (int i = 0; i < resultValue.length; i++) {
            System.out.println(resultValue[i]);
        }

    }
    public static int[] sort(int[] array){
        int temp = 0;
        int repeatTimes = array.length-1;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < repeatTimes; j++) {
                if (array[j] < array[j + 1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            repeatTimes--;
        }
        return array;
    }
    public static int[] sort1(int[] array){
        int temp = 0;
        for (int i=array.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (array[j] < array[j + 1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
