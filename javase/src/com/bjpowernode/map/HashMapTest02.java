package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "zhangsan");
        hashMap.put("age", "24");
        hashMap.put("sex", "man");

        Set<String> set = hashMap.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {

            String s = it.next();
            String value = hashMap.get(s);
            System.out.println(s + "=" + value);

        }
        System.out.println("---------------------");
        for (String item : set) {

            String value = hashMap.get(item);
            System.out.println(item + "=" + value);

        }



    }
}
