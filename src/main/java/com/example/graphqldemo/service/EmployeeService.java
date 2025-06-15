package com.example.graphqldemo.service;

import com.example.graphqldemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee addEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(Integer id);
}