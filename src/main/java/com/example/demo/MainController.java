package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private MainService service;

    @Autowired
    public MainController(MainService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getSpecial() throws Exception {
        Long i = System.currentTimeMillis();
        System.out.println(i);
        service.createUser(i);
        Long j = System.currentTimeMillis();
        System.out.println(j);
        service.createUserNotRollback(j);
        return "{}";
    }
}
