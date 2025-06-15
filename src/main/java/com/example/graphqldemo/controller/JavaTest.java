package com.example.graphqldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTest {

    public static void main(String[] args) {
        System.out.println("Addition of two number is: " + addition(10, 20));
        System.out.println("Addition of two number is using rest: " + additionRest(30, 20));
    }

    // normal java method
    public static int addition(int i, int j){
        return i + j;
    }


    //REST service -> web service (Soap, REST)
    // if it is rest/soap it will allow to call from web
    @GetMapping("/{firstNumber}/{/secondNumebr}")
    public static int additionRest(@PathVariable("firstNumber") int i,@PathVariable("secondNumber") int j){
        return i + j;
    }

}
