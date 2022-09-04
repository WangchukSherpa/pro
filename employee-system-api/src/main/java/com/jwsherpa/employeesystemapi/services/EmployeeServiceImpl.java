package com.jwsherpa.employeesystemapi.services;

import com.jwsherpa.employeesystemapi.entity.EmployeeEntity;
import com.jwsherpa.employeesystemapi.model.Employee;
import com.jwsherpa.employeesystemapi.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    final private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity=null;
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }
}
