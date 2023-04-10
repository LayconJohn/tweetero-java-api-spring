package com.tweetero.api.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<Tweet> listAll(@RequestParam(required = false) @PathVariable int page) {
        List<Tweet> tweets = service.listAll(page, 5).getContent();

        return tweets;
    }

    @GetMapping("/{username}")
    public List<Tweet> listByUsername(
        @PathVariable String username,
        @RequestParam(value = "page", required = false, defaultValue = "0") int page,
        @RequestParam(value = "size", required = false, defaultValue = "5") int size
        ) {
        return service.findByUsername(username, page, size);
    }
}
