package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeEntity serviceCreate(EmployeeEntity employee){
        return repository.save(employee);
    }

    public List<EmployeeEntity> serviceRead(){
        return repository.findAll();
    }

    public EmployeeEntity serviceFind(int id){
        return repository.findById(id).get();
    }

    public EmployeeEntity serviceUpdate(EmployeeEntity employee, int id){
        EmployeeEntity emp = repository.findById(id).get();
        emp.setEmp_name(employee.getEmp_name());
        emp.setEmp_designation(employee.getEmp_designation());
        emp.setEmp_location(employee.getEmp_location());
        emp.setEmp_salary(employee.getEmp_salary());

         repository.save(emp);
         return emp;
    }

    public void serviceDelete(int id){
        repository.deleteById(id);
    }

    public List<EmployeeEntity> serviceNameFind(String emp_name){
        return repository.findByName(emp_name);
    }

    public List<EmployeeEntity> serviceDesignationFind(String emp_designation){
        return repository.findByRole(emp_designation);
    }

    public List<EmployeeEntity> serviceLocationFind(String emp_location){
        return repository.findByLocation(emp_location);
    }

    public List<EmployeeEntity> serviceGreaterSalary(double emp_salary){
        return repository.findGreaterSalary(emp_salary);
    }

    public List<EmployeeEntity> serviceLessSalary(double emp_salary){
        return repository.findLessSalary(emp_salary);
    }


}
