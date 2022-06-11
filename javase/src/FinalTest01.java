public class FinalTest01 {
    final int weight;

    public static void main(String[] args) {

    }

    public FinalTest01(int weight){
        this.weight = weight;
    }
    public FinalTest01 (){
        this.weight = 10;
    }

}

interface AAA{

//    public abstract int sum(int a, int b);
//    public static final int a = 10;

    int sum(int a, int b);
    int a = 10;

    public   abstract int sum1();

}

abstract class BBB{

}