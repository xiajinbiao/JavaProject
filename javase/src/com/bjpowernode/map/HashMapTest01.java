package com.bjpowernode.map;

import java.awt.print.Pageable;
import java.util.*;

public class HashMapTest01 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("age", "24");
        map.put("sex", "man");

        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> item : set) {
            System.out.println(item.getValue());
        }

        System.out.println("----------------------------");
        System.out.println(map.size());

        System.out.println("----------------------------");
        /*
        * contains底层调用的都是equals()方法，所以自定义的类要重写equals()方法。
        * */
        System.out.println(map.containsKey("name"));

        System.out.println("-----------------------------");
        System.out.println(map.containsValue("zhangsan"));

        System.out.println("-----------------------------");
        System.out.println(map.isEmpty());

        System.out.println("-----------------------------");
        map.remove("age");
        System.out.println(map.size());

        System.out.println("-----------------------------");
        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println(s);
        }

        System.out.println("-----------------------------");
        map.clear();
        System.out.println(map.size());

        System.out.println("-----------------------------");
        System.out.println(map.get("age"));

    }
}
