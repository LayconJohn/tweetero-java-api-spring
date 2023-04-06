package com.tweetero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetero.api.model.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
