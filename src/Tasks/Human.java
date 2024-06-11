public class Human{
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "name: " + name + " age: " + age;
    }
}
