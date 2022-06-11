package com.bjpowernode.collection;

import java.util.*;

public class ListTest01 {
    public static void main(String[] args) {

        List myList = new ArrayList();
        /*List myList = new Vector();
        List myList = new LinkedList();*/

        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        Iterator it = myList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---------------------");

        // 向列表指定位置插入元素（默认为在末尾添加）
        // 效率较低，使用较少。
        myList.add(1, "java");

        Iterator it2 = myList.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        System.out.println("------------------------------");
        // 获取指定位置的元素
        Object o = myList.get(1);
        System.out.println(o);

        System.out.println("---------------------------");
        // 通过下标遍历List（List特有的）
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("---------------------------------");
        // 指定对象第一次出现的索引
        System.out.println(myList.indexOf("aaa"));

        System.out.println("---------------------------------");
        // 最后一次出现的索引
        System.out.println(myList.lastIndexOf("java"));

        System.out.println("---------------------------------");
        // 删除指定下标的元素(有返回值，返回值是List中的元素)
        System.out.println(myList.remove(1));
        System.out.println(myList.size());

        System.out.println("---------------------------------");
        // list.Set()函数有返回值，返回值是替换前的元素
        System.out.println(myList.set(2, "WWW"));
        System.out.println(myList.size());
        System.out.println("---------------------------------");
        Iterator it3 = myList.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }

    }
}
