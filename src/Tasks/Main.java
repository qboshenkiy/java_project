//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human male = new Human("Alan", 19);
        Human female = new Human("Anna", 15);
        System.out.println(male.getInfo());
        System.out.println(female.getInfo());

        Dog dog = new Dog("Мяско", "Дворняшка");
        Dog dog2= new Dog("Sharik", "Дворняшка");
        dog2.name = "Шарик";
        System.out.println(dog2.getInfo());

        triangle tr1 = new triangle(100.10, 300.23);
        System.out.println(tr1.getSquare());

        Circle cir1 = new Circle(21);
        cir1.R = 40;
        System.out.println(cir1.getSquare());
        System.out.println(cir1.getCircleLength());

        
    }
}
