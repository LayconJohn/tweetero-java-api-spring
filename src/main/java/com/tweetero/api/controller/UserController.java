package com.tweetero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dto.UserDto;
import com.tweetero.api.model.Users;
import com.tweetero.api.service.UserService;

@RestController
@RequestMapping("/sign-up")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<Users> listAll(){
        return service.listAll();
    }

    @PostMapping
    public String create(@RequestBody UserDto req) {
        service.create(new Users(req));
        return "OK";
    }
}
