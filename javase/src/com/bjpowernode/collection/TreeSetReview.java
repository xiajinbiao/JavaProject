package com.bjpowernode.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetReview {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("wangwu");
        set.add("wangwu");
        set.add("wangwu");


        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String item : set) {
            System.out.println(item);
        }

    }
}
