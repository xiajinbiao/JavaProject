package com.bjpowernode.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapReview {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            String value = map.get(key);
            System.out.println("key: " + key + ", value :" + value);
        }

        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
        for (Map.Entry<Integer, String> node : set1) {
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println("key=>" + key + ", value=>" + value);
        }

    }
}
