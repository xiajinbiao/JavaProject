package com.bjpowernode.collection;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListReview {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String item : list) {
            System.out.println(item);
        }
    }
}
