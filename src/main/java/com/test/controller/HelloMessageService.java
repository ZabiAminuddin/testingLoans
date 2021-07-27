package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

    @Autowired
    private UserController us;

    @Autowired
    DataRepository ds;

    @Value("${name:unknown}")
    private String name;

    public String getMessage() {
        return getMessage(name);
    }

    public String getMessage(String name) {
        return "Hello " + name;
    }

    public void getData() {
        ds.findAll();
     //   System.out.println(us.getAllUsers());
    }

}
