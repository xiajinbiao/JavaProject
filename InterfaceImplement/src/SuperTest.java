public class SuperTest {

    public static void main(String[] args) {

        final BBB bbb = new BBB(10);
        System.out.println(bbb.getNum());

    }
}

class AAA{
    private int num;

    public AAA(int num) {
        this.num = num;
    }

    public AAA() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class BBB extends AAA{
    public void doSome(){

    }

    public BBB(int num) {
        this.setNum(10);
    }
}
