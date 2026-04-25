package org.example.model;

import java.util.List;

public class Department {
    private String id;
    private String departmentName;
    private List<Instructor> instructorList;

    public Department(String id, String departmentName, List<Instructor> instructorList){
        this.id = id;
        this.departmentName = departmentName;
        this.instructorList = instructorList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", instructorList=" + instructorList +
                '}';
    }
}
