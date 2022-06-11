public class HomeWork4 {

    public static void main(String[] args) {

        Number n = new Number(10, 3);
        // 计算
        n.add();
        n.sub();
        n.mul();
        n.div();

    }
}

class Number{


    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    /*加、减、乘、除*/

    public void add(){

        System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
        System.out.println(this.getN1() + "+" + this.getN2() + "=" + (this.getN1() + this.getN2()));

    }
    public void sub(){

        int result = this.getN1() - this.getN2();
        System.out.println(result);

    }

    public void mul(){

        int result = this.getN1() * this.getN2();
        System.out.println(result);

    }

    public void div(){

        int result = n1 / n2;
        System.out.println(result);

    }

}
