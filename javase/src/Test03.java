abstract public class Test03 {
    public Test03() {
        super();
    }

    public static void main(String[] args) {
        System.out.println("111");
    }

}


abstract class Abstruct extends Test03 {
    public abstract void doSome();
    // 没有方法体，结尾是分号；
    // 修饰符里面有abstract关键字
    // 抽象类中不一定有抽象方法
    // 抽象类中不一定有抽象方法，但是抽象方法必须出现在抽象类中

}