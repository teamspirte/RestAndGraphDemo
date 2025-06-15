package com.example.graphqldemo.controller;

import com.example.graphqldemo.model.Employee;
import com.example.graphqldemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeGraphController {

    @Autowired
    private EmployeeService employeeService;


    @QueryMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @QueryMapping
    public Employee getEmployeeById(@Argument String id){
        return employeeService.getEmployeeById(Integer.valueOf(id));
    }

    @MutationMapping //create, edit, update, delete
    public Employee addEmployee(@Argument Employee employee){
        return employeeService.addEmployee(employee);
    }

    @MutationMapping
    public Employee updateEmployee(@Argument Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @MutationMapping
    public String deleteEmployeeById(@Argument Integer id){
        return employeeService.deleteEmployeeById(id);
    }
}