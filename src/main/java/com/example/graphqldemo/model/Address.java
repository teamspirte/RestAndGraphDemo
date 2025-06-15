//package com.example.graphqldemo.model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Entity
//@Data
//@AllArgsConstructor
//public class Address {
//    @Id
//    @Column(name = "ADD_ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Integer addId;
//    @Column(name = "STREET")
//    String street;
//    @Column(name = "CITY")
//    String city;
//
//    @ManyToOne
//    @JoinColumn(name = "EMP_ID")
//    private Employee employee;
//
//    public Address(String street, String city, Employee employee) {
//        this.street = street;
//        this.city = city;
//        this.employee = employee;
//    }
//}