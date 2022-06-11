package com.bjpowernode.collection;

import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {

        TreeSet<Custmoer> ts= new TreeSet<>();
        ts.add(new Custmoer(20));
        ts.add(new Custmoer(30));
        ts.add(new Custmoer(10));
        ts.add(new Custmoer(40));

        for (Custmoer c : ts) {
            System.out.println(c);
        }


    }
}


class Custmoer implements Comparable<Custmoer>{
    int age;

    public Custmoer(int age) {
        this.age = age;
    }

    public Custmoer() {
    }

    @Override
    public int compareTo(Custmoer o) {
        return this.age - o.age;
    }

    public String toString() {
        return "Customer[age = "+ age +"]";
    }

}