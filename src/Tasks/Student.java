package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private double grade;
    private List<String> courses;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Курсы студента " + name + ":");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Арафат", 5);

        student.addCourse("Математика");
        student.addCourse("Физика");
        student.addCourse("Информатика");

        System.out.println("Студент: " + student.getName());
        System.out.println("Оценка: " + student.getGrade());
        student.displayCourses();

        student.removeCourse("Физика");

        student.displayCourses();
    }
}
