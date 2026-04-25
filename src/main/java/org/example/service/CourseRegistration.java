package org.example.service;

import org.example.model.Course;

public interface CourseRegistration {
    void save(Course course);
    void displayAll(Course course);
    void updateCourse(Course course);
    void removeCourse(Course course);
}
