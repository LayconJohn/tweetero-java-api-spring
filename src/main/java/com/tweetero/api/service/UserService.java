package com.tweetero.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.api.model.Users;
import com.tweetero.api.repository.UserRepository;

@Service
public class UserService {

    @Autowired UserRepository repository;

    public List<Users> listAll(){
        return repository.findAll();
    }

    public void create(Users data) {
        repository.save(data);
    }

}
