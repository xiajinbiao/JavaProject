package com.bjpowernode.collection;

import javax.management.ObjectName;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest01 {
    public static void main(String[] args) {

        Properties pro = new Properties();

        pro.put("name", "zhangsan");
        pro.put("age", "24");
        pro.put("sex", "man");

        String name = pro.getProperty("name");
        String age = pro.getProperty("age");
        String sex = pro.getProperty("sex");

        Set<Map.Entry<Object, Object>> set = pro.entrySet();
        for (Map.Entry<Object, Object> node : set) {

            Object key = node.getKey();
            Object value =node.getValue();
            System.out.println(key + "=" + value);
        }



    }
}
