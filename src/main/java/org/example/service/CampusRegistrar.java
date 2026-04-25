package org.example.service;

import org.example.model.Course;
import org.example.model.Student;

public class CampusRegistrar {
    private StudentRegistration registration;
    private CourseRegistration courseRegistration;
    private DepartmentRegistration departmentRegistration;

    public CampusRegistrar(StudentRegistrationImpl registration, CourseRegistrationImpl courseRegistration){
        this.registration = registration;
        this.courseRegistration = courseRegistration;
    }


    public String saveStudent(Student student){
        registration.saveStudent(student);
        return "Success";
    }
    public String saveCourse(Course course){
        courseRegistration.save(course);
        return "Success";
    }

    public void displayAllStudent(){
        registration.displayAllStudent();
    }
}
