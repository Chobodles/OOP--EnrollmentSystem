package org.example;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Course c = new Course();

        s1.setStudentID("000123");
        s1.setStudentName("John Doe");
        s1.setProgram("Information Technology");

        s2.setStudentID("000124");
        s2.setStudentName("Jane Doe");
        s2.setProgram("Information Technology");

        c.setCourseID("0001");
        c.setCourseName("Integrative Programming");
        c.setProgram("Information Technology");

        System.out.println(s1.getStudentID());
        System.out.println(s1.getStudentName());
        System.out.println(s1.getProgram());
        System.out.println();

        System.out.println(s2.getStudentID());
        System.out.println(s2.getStudentName());
        System.out.println(s2.getProgram());
        System.out.println();

        System.out.println(c.getCourseID());
        System.out.println(c.getCourseName());
        System.out.println(c.getProgram());
        System.out.println();


        s1.display();

        s2.display();

        c.display();
    }
}