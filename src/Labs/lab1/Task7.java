package Labs.lab1;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст пользователя: ");
        int age = scanner.nextInt();

        System.out.print("Вывод: ");
        if (age % 2 == 0) {
            for (int i = 2; i <= age; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = 1; i <= age; i += 2) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
