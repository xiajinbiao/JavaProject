package com.bjpowernode.collection;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("abe");
        list.add("abd");
        list.add("abg");
//        List<String> temp = Collections.synchronizedList(list);
        Collections.synchronizedList(list);
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        List<Animal3> animals = new ArrayList<>();
        animals.add(new Animal3(100));
        animals.add(new Animal3(1000));
        animals.add(new Animal3(10000));
        animals.add(new Animal3(10));

        Collections.synchronizedList(animals);
        Collections.sort(animals);

        for (Animal3 animal : animals) {
            System.out.println(animal);
        }
    // Set集合排序
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingdom");
        set.add("king2");
        set.add("king1");

        List<String> list1 = new ArrayList<>(set);
        Collections.sort(list1);
        for (String item : list1) {
            System.out.println(item);
        }



    }
}

class Animal3 implements Comparable<Animal3>{

    int age;

    public Animal3(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal3{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Animal3 o) {
        return this.age - o.age;
    }
}