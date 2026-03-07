package org.example;

import org.example.model.Student;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();


        System.out.println("[1] Save Student\n" +
                "[2] Display Student\n" +
                "[3] Update Student\n" +
                "[4] Remove Student\n" +
                "[5] Exit");

//        System.out.print("Enter: ");
//        String choice = scanner.nextLine();

        Student s1 = new Student("1234", "paul", "IT");

        while(true) {
            System.out.print("Enter: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> studentRegistration.saveStudent(s1);
                case "2" -> studentRegistration.displayAllStudent(s1);
                case "3" -> studentRegistration.updateStudent(s1);
                case "4" -> studentRegistration.removeStudent(s1);
                case "5" -> System.exit(0);

            }
        }
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Course c = new Course();
//
//        s1.setStudentID("000123");
//        s1.setStudentName("John Doe");
//        s1.setProgram("Information Technology");
//
//        s2.setStudentID("000124");
//        s2.setStudentName("Jane Doe");
//        s2.setProgram("Information Technology");
//
//        c.setCourseID("0001");
//        c.setCourseName("Integrative Programming");
//        c.setProgram("Information Technology");
//
//        s1.display();
//
//        s2.display();
//
//        c.display();
    }
}