package com.bjpowernode.collection;

import java.util.*;

public class ListTest03 {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        List list2 = new ArrayList(100);

        Collection collection = new HashSet();
        collection.add(100);
        collection.add(200);
        collection.add(300);
        collection.add(400);

        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("----------------------------");
        List list3 = new ArrayList(collection);

        Iterator it = list3.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
