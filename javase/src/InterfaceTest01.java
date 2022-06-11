// 1、接口是一种引用数据类型，是完全抽象的（抽象类是半抽象的），或者可以说接口是特殊的抽象类。
// 语法：
//      [修饰符列表] interface 接口名{
//      }
// 接口支持多继承（继承多个接口）
// 接口中只包含两部分内容，一部分是常量，一部分是抽象方法，没有其他内容
// 接口中所有的元素都是公开的（public修饰的）
// 接口中的抽象方法定义的时候，public abstract修饰符可以省略
// 常量前面的public static final可以省略
// 当一个非抽象的类实现接口中的抽象方法时，需要将接口中的方法全部实现/覆盖/重写

public class InterfaceTest01 {
    public static void main(String[] args) {

//        System.out.println(Inf.PI);
        Inf inf = new InfImp1();

        Y y = new Z();
        X x = (X)y;



    }
}

// 定义接口
interface Inf {

    // public abstract void myMath();
//    void myMath();

    double PI = 3.1415926;
    void m1();

}

interface Inf2 {
    void m2();
}

interface Inf3 {
    void m3();
}

//abstract class InfImp1 implements Inf {
//
///*    public void myMath() {
//
//    }*/
//}

class InfImp1 implements Inf, Inf2, Inf3 {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

interface X {

}
interface Y {

}

class Z implements Y {

}