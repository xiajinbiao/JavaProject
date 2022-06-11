package com.bjpowernode.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {

        List<String> link = new LinkedList<>();
        link.add("abc");
        link.add("def");
        link.add("xyz");

        Iterator<String> it = link.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------------");

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            Integer integer = it2.next();
            System.out.println(integer);
        }
        System.out.println("-------------------------------");

        for (int i = 0; i < link.size(); i++) {
            System.out.println(link.get(i));
        }
        System.out.println("-------------------------------");

        for (String s : link) {
            System.out.println(s);
        }
        System.out.println("-------------------------------");

        for (Integer item : list) {
            System.out.println(item);
        }

    }
}
