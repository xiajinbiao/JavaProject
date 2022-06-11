package com.bjpowernode.collection;

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("wangwu");
        treeSet.add("zhaoliu");
        // 升序
        for (String s : treeSet) {
            System.out.println(s);
        }

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(100);
        treeSet1.add(200);
        treeSet1.add(300);
        // 升序
        for (Integer item : treeSet1) {
            System.out.println(item);
        }


    }
}
