package com.example;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    @Query(value = "select * from details where emp_name = ?1", nativeQuery=true)
    public List<EmployeeEntity> findByName(String emp_name);

    @Query(value = "select * from details where emp_designation = ?1", nativeQuery = true)
    public List<EmployeeEntity> findByRole(String emp_designation);

    @Query(value = "select * from details where emp_location = ?1", nativeQuery = true)
    public List<EmployeeEntity> findByLocation(String emp_location);

    @Query(value = "select * from details where emp_salary > ?1", nativeQuery = true)
    public List<EmployeeEntity> findGreaterSalary(double emp_salary);

    @Query(value = "select * from details where emp_salary < ?1", nativeQuery = true)
    public List<EmployeeEntity> findLessSalary(double emp_salary);

}
