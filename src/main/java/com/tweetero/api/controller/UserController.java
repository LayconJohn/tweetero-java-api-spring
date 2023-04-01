package com.tweetero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dto.UserDto;
import com.tweetero.api.model.User;
import com.tweetero.api.repository.UserRepository;

@RestController
@RequestMapping("/api/sign-up")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody UserDto req) {
        repository.save(new User(req));
    }
}
