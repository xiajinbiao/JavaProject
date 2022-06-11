import org.w3c.dom.ls.LSOutput;

public class HomeWork6 {
    public static void main(String[] args) {
        Musician m = new Musician();

        Erhu e = new Erhu();
        m.play(e);

        Piano p = new Piano();
        m.play(p);

        Violion v = new Violion();
        m.play(v);

    }
}


class Instrument{
    public void makeSound(){
        System.out.println();
    }
}

class Erhu extends Instrument{
    public void makeSound(){
        System.out.println("二胡发声");
    }
}

class Piano extends Instrument{
    public void makeSound(){
        System.out.println("钢琴发声");
    }
}

class Violion extends Instrument {
    public void makeSound(){
        System.out.println("小提琴发声");
    }
}

class Musician {

    public void play(Instrument instrument){

        instrument.makeSound();
    }
}