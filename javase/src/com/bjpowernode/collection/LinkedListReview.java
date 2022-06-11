package com.bjpowernode.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReview {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Integer item : list) {
            System.out.println(item);
        }
    }
}
