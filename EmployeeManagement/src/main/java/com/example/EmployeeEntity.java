package com.example;


import jakarta.persistence.*;

@Entity
@Table(name="details")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String emp_name;
    private String emp_designation;
    private String emp_location;
    private double emp_salary;

    public EmployeeEntity() {

    }

    public EmployeeEntity(int emp_id, String emp_name, String emp_designation, String emp_location, double emp_salary) {
        super();
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_designation = emp_designation;
        this.emp_location = emp_location;
        this.emp_salary = emp_salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_designation() {
        return emp_designation;
    }

    public void setEmp_designation(String emp_designation) {
        this.emp_designation = emp_designation;
    }

    public String getEmp_location() {
        return emp_location;
    }

    public void setEmp_location(String emp_location) {
        this.emp_location = emp_location;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }
}
