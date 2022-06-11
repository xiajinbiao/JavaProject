public class ImplementTest001 {

    public static void main(String[] args) {

        AbcImpl abcImpl =  new AbcImpl();
        System.out.println(abcImpl.sum(1, 2));

        Hig hig = new AbcImpl();
        hig.doSome();

        Abc abc = new AbcImpl();
        System.out.println(abc.sum(1, 2));

    }

}

interface Abc{

    int sum(int a, int b);

}

class Hig{
    public void doSome(){
        System.out.println("doSome");
    }
}

interface Def{

}

class AbcImpl extends Hig implements Abc{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}