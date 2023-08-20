package com.payroll.employee.controller;

import com.payroll.employee.config.ResponseControl;
import com.payroll.employee.model.Address;
import com.payroll.employee.model.Employee;
import com.payroll.employee.model.EmployeeDTO;
import com.payroll.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class Controller {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseControl<List<Employee>> getEmployees() {
        List<Employee> list = repository.findAll();
        ResponseControl<List<Employee>> responseControl = new ResponseControl<List<Employee>>(String.valueOf(Math.random()), list, null);
        return responseControl;
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseControl<Employee> getEmployee(@PathVariable String id) {
        List<Employee> employee = repository.findByEmployeeId(id);
        return new ResponseControl<Employee>(String.valueOf(Math.random()), employee.get(0), null);
    }

    @PostMapping
    public ResponseControl<String> saveEmployee(@RequestBody @Valid Employee employee) {
        Employee employee1 = repository.save(employee);
        return new ResponseControl<String>(String.valueOf(Math.random()), "Success", null);
    }

}
