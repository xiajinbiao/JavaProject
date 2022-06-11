import org.w3c.dom.ls.LSOutput;

public class  User{

    public static void main(String[] args) {
        A a = new A(10);
        System.out.println(a.age);

    }
}




class A {

    int age;


    public A(int age) {
        this.age = age;
    }
}
