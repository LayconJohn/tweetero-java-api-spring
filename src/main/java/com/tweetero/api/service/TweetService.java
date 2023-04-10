package com.tweetero.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tweetero.api.model.Tweet;
import com.tweetero.api.repository.TweetRepository;

@Service
public class TweetService {
    @Autowired TweetRepository repository;

    public void create(Tweet data) {
        repository.save(data);
    }

    public Page<Tweet> listAll(int page, int size) {

        PageRequest pageRequest = PageRequest.of(
            page,
            size,
            Sort.Direction.DESC,
            "id"
            );
        return new PageImpl<>(repository.findAll(), pageRequest, size);
    }
}
