package Tasks;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee1 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee1(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public long calculateYearsOfWork() {
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.YEARS.between(hireDate, currentDate);
    }

    public static void main(String[] args) {
        LocalDate hireDate = LocalDate.of(2010, 5, 15);
        Employee1 employee = new Employee1("Арафат", 50000, hireDate);

        System.out.println("Имя: " + employee.getName());
        System.out.println("Зарплата: " + employee.getSalary());
        System.out.println("Дата приема на работу: " + employee.getHireDate());
        System.out.println("Стаж работы (лет): " + employee.calculateYearsOfWork());
    }
}
