package com.yaroslavambrozyak.chatapp.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {

   // @ExceptionHandler(Exception.class)
    public String handle(Exception e){
        System.out.println("in");
        return "";
    }

}
