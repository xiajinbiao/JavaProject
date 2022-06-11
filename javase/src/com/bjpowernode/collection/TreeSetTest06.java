package com.bjpowernode.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest06 {
    public static void main(String[] args) {

        TreeSet<Animal2> animals = new TreeSet<>(new Animal2Comparable());

        animals.add(new Animal2(20));
        animals.add(new Animal2(10));
        animals.add(new Animal2(30));
        animals.add(new Animal2(10));

        for (Animal2 animal : animals) {
            System.out.println(animal);
        }



    }
}

class Animal2 {

    int age;

    public Animal2(int age) {
        this.age = age;
    }

    public Animal2() {
    }

    @Override
    public String toString() {
        return "Animal2{" +
                "age=" + age +
                '}';
    }
}


class Animal2Comparable implements Comparator<Animal2> {


    @Override
    public int compare(Animal2 o1, Animal2 o2) {
        return o1.age - o2.age;
    }
}