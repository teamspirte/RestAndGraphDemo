package com.example.graphqldemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Data
@Table(name = "EMPLOYEE")
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private Integer empId;
    @Column(name = "EMP_NAME")
    private String name;
    @Column(name = "EMP_AGE")
    private double age;
    @Column(name = "EMP_CITY")
    private String city;
   /* @OneToMany(mappedBy = "ADD_ID")
    private List<Address> addresses;*/

    /*public Employee(String name, double age, Department dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }*/

    public Employee() {
    }
}
