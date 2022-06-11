import java.util.Objects;

public class StringTest01 {
    public static void main(String[] args) {

//        User user1 = new User("张三", new Address("北京", "大街", new String("000001")));
//        User user2 = new User("张三", new Address("北京", "大街", new String("000001")));
//        System.out.println(user1);
//        System.out.println(user1.equals(user2));

        Address address1 = new Address();
        Address address2 = new Address();

    }
}

class User {

    String name;
    Address address;

    public User () {}

    public User (String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
       /* return Objects.equals(name, user.name) &&
                Objects.equals(address.city, user.address.city) &&
                Objects.equals(address.street, user.address.street) &&
                Objects.equals(address.zipcode, user.address.zipcode);*/
        /*return (this.name.equals(user.name) &&
                this.address.city.equals(user.address.city) &&
                this.address.street.equals(user.address.street) &&
                this.address.zipcode.equals(user.address.zipcode));*/
        return this.name.equals(user.name) &&
                this.address.equals(user.address);

    }
    public String toString() {

        return ("名字：" + this.name + ", 城市：" + this.address.city + ", 街道：" + this.address.street
                            + ", 邮编：" + this.address.zipcode);
    }

}

class Address {

    String city;
    String street;
    String zipcode;

    public Address () {}

    public Address (String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zipcode, address.zipcode);
    }

/*    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("即将被回收！！！");
    }*/
}