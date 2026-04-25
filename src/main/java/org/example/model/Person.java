package org.example.model;

public abstract class Person {
    private String ID;
    private String name;

    public String getID() {
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void mainTask();

//    @Override
//    public String toString() {
//        return "Person{" +
//                "ID='" + ID + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
