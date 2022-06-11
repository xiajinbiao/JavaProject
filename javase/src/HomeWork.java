import java.util.Objects;

public class HomeWork {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.setSpeed(120);
        v.setSize(10);
        System.out.println(v.getSpeed());
        v.upSpeed(10);
        System.out.println(v.getSpeed());
        v.subSpeed(20);
        System.out.println(v.getSpeed());
        v.move();


    }

}

class Vehicle {

    private int speed;
    private int size;

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSize() {
        return size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void move() {
        System.out.println("交通工具： 公交车，启动行驶");
    }

    public void upSpeed(int addSpeed) {

        this.setSpeed(this.speed + addSpeed);

    }

    public void subSpeed(int dowmSpeed) {

        if (this.speed > dowmSpeed) {

            this.setSpeed(this.speed - dowmSpeed);
        } else {
            System.out.println("您输入的速度有误！！！");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed &&
                size == vehicle.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, size);
    }
}

