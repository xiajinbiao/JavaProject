package com.bjpowernode.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashSetReview {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
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

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 1);
        map.put(4, 4);
        map.put(2, 2);
        map.put(3, 3);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
