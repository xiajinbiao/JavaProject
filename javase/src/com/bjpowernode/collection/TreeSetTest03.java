package com.bjpowernode.collection;

/*
* 以下代码有问题！！！
* java.lang.ClassCastException: class com.bjpowernode.collection.Animal1 cannot be cast to class java.lang.Comparable
* Animal1类没有实现Comparable接口
* 因为没有实现比较的接口，二叉树不能排序
* */

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {

        TreeSet<Animal1> treeSet = new TreeSet<>();
        treeSet.add(new Animal1("zhangsan"));
        treeSet.add(new Animal1("lisi"));
        treeSet.add(new Animal1("wangwu"));
        treeSet.add(new Animal1("zhaoliu"));

        for (Animal1 s : treeSet) {
            System.out.println(s);
        }
    }
}

class Animal1 {

    String name;

    public Animal1(String name) {
        this.name = name;
    }

    public Animal1() {
    }

    @Override
    public String toString() {
        return "Animal1{" +
                "name='" + name + '\'' +
                '}';
    }
}
