/**
 * StringBuffer中方法都有：synchronized关键字修饰，表示StringBuffer在多线程的环境下是安全的
 * StringBuilder中方法都没有synchronized关键字修饰，表示StringBuilder在多线程环境下是不安全的
 * StringBuffer是线程安全的
 * StringBuilder是非线程安全的
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer(3);
        stringBuffer.append("hello");
        stringBuffer.append("world");
        System.out.println(stringBuffer);
        Integer i  = new Integer("123");
        System.out.println(i);
        doSome(10);
        Integer x = 100;
        doSome(x);
        int y = x;


    }

    public static void doSome(Object object) {
        System.out.println(object);
    }
}
