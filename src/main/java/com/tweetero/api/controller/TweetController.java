package com.tweetero.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dto.TweetDto;
import com.tweetero.api.model.Tweet;
import com.tweetero.api.service.TweetService;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    
    @Autowired TweetService service;

    @PostMapping
    public String create(@RequestBody TweetDto req) {
        service.create(new Tweet(req));
        return "OK";
    }

    @GetMapping
    public Page<Tweet> listAll(@PageableDefault(size = 5) Pageable pageable) {
        return service.listAll(pageable);
    }
}
