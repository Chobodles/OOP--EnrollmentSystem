package org.example.service;

import org.example.model.Course;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistrationImpl implements CourseRegistration {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Course> courseList = new ArrayList<>();

    public void save(Course course){
        courseList.add(course);
    }

    public void displayAll(Course course){
        System.out.println(course);
    }

    public void updateCourse(Course course){
        for (int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(course.getCourseID())){
                System.out.println("Enter Name: ");
                String courseName = scanner.nextLine();

                System.out.println("Enter Program: ");
                String program = scanner.nextLine();

                courseList.set(i, new Course(course.getCourseID(), courseName, program));
                break;
            }
        }
    }
    public void removeCourse(Course course){
        for (int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID().equals(course.getCourseID())){
                courseList.remove(i);
                break;
            }
        }
    }
}
