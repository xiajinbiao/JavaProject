public class PrivateTest {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.doOther();
        Animal animal1 = new Cat();
        animal1.doOther();
        

    }
}

class Animal{
    private void doSome(){
        System.out.println("Animal");
    }
    public void doOther(){
        doSome();
    }

}

class Cat extends Animal{

}
