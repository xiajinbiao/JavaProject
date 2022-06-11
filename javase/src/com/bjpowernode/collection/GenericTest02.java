package com.bjpowernode.collection;

public class GenericTest02 <E> {
    public static void main(String[] args) {

        GenericTest02<String> gt = new GenericTest02<>();
        gt.doSome("ang");

    }


    public void doSome(E e) {

    }
}
