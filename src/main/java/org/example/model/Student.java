package org.example.model;

public class Student extends Person {

    private String program;

    public Student(){}

    public Student(String ID, String name, String program) {
        super.setID(ID);
        super.setName(name);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }


    public void display(){
        System.out.println("Student ID: " + super.getID());
        System.out.println("Student Name: " + super.getName());
        System.out.println("Program: " + getProgram());
        System.out.println();
    }
}
