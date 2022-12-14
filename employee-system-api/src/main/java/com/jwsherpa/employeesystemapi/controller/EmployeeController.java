package com.jwsherpa.employeesystemapi.controller;


import com.jwsherpa.employeesystemapi.model.Employee;
import com.jwsherpa.employeesystemapi.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController implements EmployeeService{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
       return employeeService.createEmployee(employee);
    }
}
