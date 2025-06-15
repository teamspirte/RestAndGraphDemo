package com.example.graphqldemo.service;

//import com.example.graphqldemo.model.Address;
//import com.example.graphqldemo.model.Department;
import com.example.graphqldemo.model.Employee;
//import com.example.graphqldemo.repository.AddressRepository;
import com.example.graphqldemo.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    /*@Autowired
    private AddressRepository addressRepository;*/

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return (Employee) employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        if(!employeeRepository.findById(employee.getEmpId()).isEmpty()) {
            return (Employee) employeeRepository.save(employee);
        }else{
            throw new IllegalArgumentException("Invalid employee");
        }
    }

    @Override
    public String deleteEmployeeById(Integer id) {
        if(!employeeRepository.findById(id).isEmpty()) {
            employeeRepository.deleteById(id);
            return "Employee deleted from db";
        }else{
            return "Employee not present in db";
        }
    }

    /*@PostConstruct
    private void init(){
        Employee emp = new Employee("Satish", 32.34, Department.IT);
        employeeRepository.save(emp);
        *//*Address address = new Address(1, "Karegaon road", "Parbhani", emp);
        addressRepository.save(address);*//*
    }*/
}
