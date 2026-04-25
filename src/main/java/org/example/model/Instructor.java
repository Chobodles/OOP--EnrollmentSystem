package org.example.model;

import java.util.List;

public class Instructor extends Person{
    private List<Course> courseList;
    private List<Student> studentList;

    Course courses = new Course();

    public Instructor(){

    }

    public Instructor(String ID, String name, List<Course> courseList, List<Student> studentList) {
        super.setID(ID);
        super.setName(name);
        this.courseList = courseList;
        this.studentList = studentList;
    }

//    public void setProgram(String course){
//       this.course = course;
//    }

    public void mainTask(){
        System.out.println("Instructor Grades");
    }

    public List<Course> displayCourse(){
        return courseList.stream().toList();
    }
    public List<Student> displayStudent(){
        return studentList.stream().toList();
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "courseList=" + courseList +
                ", studentList=" + studentList +
                ", courses=" + courses +
                '}';
    }
}
