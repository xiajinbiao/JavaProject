package com.bjpowernode.link;

public class Test {
    public static void main(String[] args) {

        Link link = new Link();
        link.add(100);
        link.add(200);
        link.add(300);
        link.add(400);
        link.add(500);
        link.add(600);
        link.add(700);

        System.out.println(link.size());

        System.out.println(link.find(3));
    }
}
