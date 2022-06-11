public class Test02 {
    public static void main(String[] args) {

        Gauss g = new Gauss(100);
        java.util.Scanner s = new java.util.Scanner(System.in);

        while (true){
            System.out.print("请输入值：");
            int gaussionNum = s.nextInt();
            g.gaussion(gaussionNum);
        }
    }
}

class Acual {

    private int a;

    public Acual(int a) {
        this.a = a;
    }

    public Acual() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class Gauss extends Acual{

    public Gauss() {
    }

    public Gauss(int a) {
        super(a);
    }

    public void gaussion(int gaussNum) {

        if (gaussNum == super.getA()) {
            System.out.println("猜对了！！！");
            System.exit(0);
        }else if (gaussNum < super.getA()){
            System.out.println("猜小了！！！");
        }else{
            System.out.println("猜大了！！！");
        }

    }
}