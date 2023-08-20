package com.payroll.employee.repository;

import com.payroll.employee.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    @Query(value = "SELECT e FROM Employee e WHERE e.empId = ?1", count = true)
    List<Employee> findByEmployeeId(String empId);
}
