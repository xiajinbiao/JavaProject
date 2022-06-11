package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest04 {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "zhangsan");
        hashMap.put(null, "lisi");
        hashMap.put(null, "wangwu");
        hashMap.put(null, "zhaoliu");

        Set<Map.Entry<String, String>> set = hashMap.entrySet();
        for (Map.Entry<String, String> node : set) {
            String key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }


    }
}
