public class Dog {
    public String name;
    public  String kind;

    public Dog(String name, String kind){
        this.name = name;
        this.kind = kind;
    }

    public String getInfo() {
        return "name: " + name + " kind: " + kind;
    }
}
