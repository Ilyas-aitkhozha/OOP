package Lab1.Problem4;

import java.util.ArrayList;
import java.util.Scanner;

import practice2.Student;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(
                "OOP", "Intro to OOP in Java", 5, "None");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Student A"));
        students.add(new Student(4, "Student B"));
        students.add(new Student(10, "Student C"));
        students.add(new Student(87, "Student D"));
        students.add(new Student(12, "Student E"));

        GradeBook gb = new GradeBook(course, students);
        gb.displayMessage();
        System.out.println("\nPlease, input grades for students:\n");

        Scanner sc = new Scanner(System.in);

        int i;
        for (i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + " grade: ");
            int grade = sc.nextInt();
            gb.setGrade(i, grade);
        }

        gb.displayGradeReport();
    }
}

