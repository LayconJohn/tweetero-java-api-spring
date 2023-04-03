package com.tweetero.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.api.dto.UserDto;
import com.tweetero.api.model.User;
import com.tweetero.api.repository.UserRepository;

@Service
public class UserService {

    @Autowired UserRepository repository;

    public List<User> listAll(){
        return repository.findAll();
    }

    public void create(User data) {
        repository.save(data);
    }

}
