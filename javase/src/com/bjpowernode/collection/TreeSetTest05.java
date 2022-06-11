package com.bjpowernode.collection;

import java.util.TreeSet;

public class TreeSetTest05 {
    public static void main(String[] args) {

        TreeSet<Vip> ts = new TreeSet<>();
        ts.add(new Vip(24, "zhangsan"));
        ts.add(new Vip(25, "zhangsan"));
        ts.add(new Vip(26, "zhangsan"));
        ts.add(new Vip(24, "wangwu"));

        for (Vip item : ts) {
            System.out.println(item);
        }


    }
}

class Vip implements Comparable<Vip>{

    int age;
    String name;

    public Vip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Vip() {
    }

    @Override
    public String toString() {
        return "Vip{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Vip o) {

        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        } else {
            return this.age - o.age;
        }
    }
}
