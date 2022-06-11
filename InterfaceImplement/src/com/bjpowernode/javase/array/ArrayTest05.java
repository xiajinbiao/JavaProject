package com.bjpowernode.javase.array;

public class ArrayTest05 {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Animal();

        Animal[] animals = {a1, a2};
        for (Animal animal : animals) {
            animal.move();
        }

        Animal[] animals1 = {new Cat(), new Bird()};

        for (Animal animal : animals1) {
            if (animal instanceof Cat) {
                Cat cat = (Cat)animal;
                cat.catchMouse();
            }else if (animal instanceof Bird){
                Bird bird = (Bird)animal;
                bird.sing();
            }
        }


    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void move() {
        System.out.println("猫在走猫步");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Bird extends Animal{
    public void move() {
        System.out.println("鸟儿在飞翔");
    }

    public void sing(){
        System.out.println("鸟儿唱歌");
    }
}