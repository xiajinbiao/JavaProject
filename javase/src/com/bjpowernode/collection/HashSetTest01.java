package com.bjpowernode.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        hashSet.add(300);
        hashSet.add(300);
        hashSet.add(300);
        hashSet.add(300);
        hashSet.add(10);


        for (Integer item : hashSet) {
            System.out.println(item);
        }

    }
}
