package com.easybank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("/")
    public String sayHello(){
        return "Welcome to Microservices Saikumar !!!!";
    }

    public String method(){
        return "";
    }
}
