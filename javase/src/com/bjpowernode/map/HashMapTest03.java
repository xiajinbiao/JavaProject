package com.bjpowernode.map;

import java.util.*;

public class HashMapTest03 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("age", "24");
        map.put("sex", "man");
        map.put("sex", "women");

        // 遍历map
        // 方式1
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {

            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);

        }
        System.out.println("----------------------------------------");

        for (String key : set) {
            System.out.println(key + "=>" + map.get(key));
        }
        System.out.println("----------------------------------------");

        // 方式二
        Set<Map.Entry<String, String>> set1 = map.entrySet();
        Iterator<Map.Entry<String, String>> it2 = set1.iterator();
        while (it2.hasNext()) {

            Map.Entry<String, String> node = it2.next();
            System.out.println(node.getKey() + "==>" + node.getKey());

        }
        System.out.println("----------------------------------------");

        for (Map.Entry<String, String> keyValue: set1) {

            String key = keyValue.getKey();
            String value = keyValue.getValue();
            System.out.println(key + "===>" + value);

        }

    }
}
