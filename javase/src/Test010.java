public class Test010 {
    public static void main(String[] args) {

        Animal1 animal1 = new Cat1();
        animal1.run();

        Fliable fliable = new Cat1();
        fliable.fly();


    }
}

class Animal1{

    public void run(){
        System.out.println("run");
    }

}

interface Fliable{
    public abstract void fly();
}

class Cat1 extends Animal1 implements Fliable{
    @Override
    public void fly() {
        System.out.println("会飞的猫");
    }
}
