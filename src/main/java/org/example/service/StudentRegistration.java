package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistration {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> studentList = new ArrayList<>();

    public void saveStudent(Student student){
        studentList.add(student);
    }

    public void displayAllStudent(Student student){
        for (int i = 0; i < studentList.size(); i++){
            studentList.get(i).display();
        }
    }

    public void updateStudent(Student student){
        for (int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getID().equals(student.getID())){
                System.out.println("Enter Name: ");
                String studentName = scanner.nextLine();

                System.out.println("Enter Program: ");
                String program = scanner.nextLine();
                studentList.set(i, new Student(student.getID(), studentName, program));
                break;
            }
        }
    }

    public void removeStudent(Student student){
        for (int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getID().equals(student.getID())){
                studentList.remove(i);
                break;
            }
        }
    }
}
