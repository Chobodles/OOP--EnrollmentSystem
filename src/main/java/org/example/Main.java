package org.example;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Student;
import org.example.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //model then interface then concrete class
        Student student = new Student();


        //create dep and section everytime create dep may section sa section lalabas student

        student.mainTask();

        Instructor instructor = new Instructor();

        instructor.mainTask();

        StudentRegistrationImpl studentRegistrationImpl = new StudentRegistrationImpl();
        CourseRegistrationImpl courseRegistrationImpl = new CourseRegistrationImpl();
        DepartmentRegistrationImpl departmentRegistrationImpl = new DepartmentRegistrationImpl();

        CampusRegistrar campusRegistrar = new CampusRegistrar(studentRegistrationImpl, courseRegistrationImpl);

        campusRegistrar.displayAllStudent();

        Course c1 = new Course("Inteprog", "Integrative Programing", "IT");
        Course c2 = new Course("Dismath", "Discrete Mathematics", "IT");

        List<Course> courseList = new ArrayList<>();
        List<Instructor> instructorList = new ArrayList<>();

        courseList.add(c1);
        courseList.add(c2);

        Student s1 = new Student("12352", "Bond", "IT");
        Student s2 = new Student("54321", "Chris", "IT");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);

        Instructor instructor1 = new Instructor("12345", "James Bond", courseList, studentList);

        Instructor instructor2 = new Instructor("543", "Tom Jerry", courseList, studentList);
        instructorList.add(instructor1);
        instructorList.add(instructor2);

        departmentRegistrationImpl.saveDepartment("1", "CITE", instructorList);

        System.out.println(instructor1.displayStudent());
//        System.out.println("[1] Save Student\n" +
//                "[2] Display Student\n" +
//                "[3] Update Student\n" +
//                "[4] Remove Student\n" +
//                "[5] Exit");
//
//        Student s3 = new Student("1234", "paul", "IT");
//
//        while(true) {
//            System.out.print("Enter: ");
//            String choice = scanner.nextLine();
//            switch (choice) {
//                case "1" -> studentRegistrationImpl.saveStudent(s1);
//                case "2" -> studentRegistrationImpl.displayAllStudent(s1);
//                case "3" -> studentRegistrationImpl.updateStudent(s1);
//                case "4" -> studentRegistrationImpl.removeStudent(s1);
//                case "5" -> System.exit(0);
//            }
//        }
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