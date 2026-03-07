package org.example.model;

public class Instructor extends Person{
    private String course;

    public Instructor(String ID, String name, String course) {
        super.setID(ID);
        super.setName(name);
        this.course = course;
    }

    public void setProgram(String course){
       this.course = course;
    }

}
