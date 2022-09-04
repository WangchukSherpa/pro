package com.jwsherpa.employeesystemapi.services;

import com.jwsherpa.employeesystemapi.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    Employee createEmployee(Employee employee);
}
