package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserController {

    @Autowired
    private DataRepository repo;
    //@GetMapping

    public List<User> getAllUsers() {
        DataRepository r = new DataRepository();

        return (List<User>) r.findAll();
    }





}
