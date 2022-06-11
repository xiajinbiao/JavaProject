package com.bjpowernode.collection;

import java.net.BindException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {

        List<Animal> myList = new ArrayList<>();

        Animal c = new Cat();
        Animal b = new Bird();
        myList.add(c);
        myList.add(b);

        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()) {

            Animal animal = it.next();
            animal.move();

            if (animal instanceof Cat){
                ((Cat) animal).catchMouse();
            } else if (animal instanceof Bird) {
                ((Bird)animal).fly();
            }
        }


    }
}

class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}

class Cat extends Animal {
    public void catchMouse () {
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal {
    public void fly () {
        System.out.println("鸟儿在飞翔");
    }
}

