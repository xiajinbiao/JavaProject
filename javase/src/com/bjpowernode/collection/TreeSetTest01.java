package com.bjpowernode.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {

        Set<String> str = new TreeSet<>();
        str.add("A");
        str.add("B");
        str.add("v");
        str.add("国");
        str.add("中");
        str.add("A");
        str.add("A");

        for (String s : str) {
            System.out.println(s);
        }

    }
}
