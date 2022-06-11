public class HomeWork5 {
    public static void main(String[] args) {

        Person p = new Person("张三", 20);
        p.display();

    }
}

class Person{

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("姓名：" + this.getName());
        System.out.println("年龄：" + this.getAge());
    }
}