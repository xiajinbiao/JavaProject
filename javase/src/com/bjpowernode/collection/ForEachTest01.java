package com.bjpowernode.collection;

public class ForEachTest01 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        for (int item : array) {
            item++;
            System.out.println(item);
        }
        // 会改变原值
        for (int item : array) {
            item++;
            System.out.println(item);
        }
    }

}
