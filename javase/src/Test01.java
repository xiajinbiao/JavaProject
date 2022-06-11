public class Test01 {

    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Bird();

        if (a1 instanceof Cat){
            Cat c1 = (Cat)a1;
            c1.catchMouse();
        }else if (a1 instanceof Bird){
            Bird b1 = (Bird)a1;
            b1.sing();
        }

        if (a2 instanceof Bird){
            Bird b2 = (Bird) a2;
            b2.sing();
        }else if (a2 instanceof Cat){
            Cat c2 = (Cat) a1;
            c2.catchMouse();
        }
    }

}
