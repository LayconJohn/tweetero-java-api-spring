package com.tweetero.api.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tweetero.api.model.Tweet;
import com.tweetero.api.repository.TweetRepository;

public class TweetService {
    @Autowired TweetRepository repository;

    public void create(Tweet data) {
        repository.save(data);
    }
}
 