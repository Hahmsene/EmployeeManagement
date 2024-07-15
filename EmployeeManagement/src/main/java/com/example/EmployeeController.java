package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/save")
    public EmployeeEntity controlCreate(@RequestBody EmployeeEntity employee){
        return service.serviceCreate(employee);
    }

    @GetMapping("/all")
    public List<EmployeeEntity> controlRead(){
        return service.serviceRead();
    }

    @GetMapping("/findbyid/{id}")
    public EmployeeEntity controlFind(@PathVariable int id){
        return service.serviceFind(id);
    }

    @PutMapping("/update/{id}")
    public EmployeeEntity controlUpdate(@PathVariable int id, @RequestBody EmployeeEntity employee){
        return service.serviceUpdate(employee, id);
    }

    @DeleteMapping("/delete/{id}")
    public void controlDelete(@PathVariable int id){
         service.serviceDelete(id);
    }

    @GetMapping("/findbyname/{emp_name}")
    public List<EmployeeEntity> controlNameFind(@PathVariable String emp_name){
        return service.serviceNameFind(emp_name);
    }

    @GetMapping("/findbyrole/{emp_designation}")
    public List<EmployeeEntity> controlDesignationFind(@PathVariable String emp_designation){
        return service.serviceDesignationFind(emp_designation);
    }

    @GetMapping("/findbylocation/{emp_location}")
    public List<EmployeeEntity> controlLocationFind(@PathVariable String emp_location){
        return service.serviceLocationFind(emp_location);
    }

@GetMapping("/greatsalary/{emp_salary}")
    public List<EmployeeEntity> controlGreaterSalary(@PathVariable double emp_salary){
        return service.serviceGreaterSalary(emp_salary);
}

@GetMapping("/lesssalary/{emp_salary}")
    public List<EmployeeEntity> controlLessSalary(@PathVariable double emp_salary){
        return service.serviceLessSalary(emp_salary);
}

}
