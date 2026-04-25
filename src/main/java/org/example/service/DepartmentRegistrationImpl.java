package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRegistrationImpl implements DepartmentRegistration {
    List<Department> departments;

    public DepartmentRegistrationImpl(){
        this.departments = new ArrayList<>();
    }

    public DepartmentRegistrationImpl(String id, String departmentName,List<Instructor> instructorList) {
        this.departments = new ArrayList<>();
    }
    public void saveDepartment(String id, String departmentName,List<Instructor> instructorList){
        departments.add(new Department(id, departmentName, instructorList));
    }

    public List<Department> displayDepartment() {
        return departments.stream().toList();
    }

    public void updateDepartment(){

    };
    public void removeDepartment(){

    };

    public void displayInstructorDepartment(String departmentID){
        for (int i = 0; i < departments.size(); i++){
            if(departmentID.equals(departments.get(i).getId())){}
            System.out.println(departments.get(i).getInstructorList());
        }
    }
}
