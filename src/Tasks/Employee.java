package Tasks;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double percentageIncrease) {
        if (percentageIncrease > 0) {
            salary += salary * (percentageIncrease / 100);
        }
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Арафат", "Разработчик", 50000);
        System.out.println("Сотрудник: " + employee1.getName());
        System.out.println("Должность: " + employee1.getPosition());
        System.out.println("Зарплата: " + employee1.getSalary());

        employee1.updateSalary(10);
        System.out.println("Обновленная зарплата: " + employee1.getSalary());
        System.out.println("Годовая зарплата: " + employee1.calculateAnnualSalary());
    }
}
