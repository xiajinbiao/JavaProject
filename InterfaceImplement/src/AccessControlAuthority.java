public class AccessControlAuthority {

    private int age;
    private int weight;
    private int id;
    String name;

    public AccessControlAuthority(int age, int weight, int id, String name) {
        this.age = age;
        this.weight = weight;
        this.id = id;
        this.name = name;
    }

    public AccessControlAuthority() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
