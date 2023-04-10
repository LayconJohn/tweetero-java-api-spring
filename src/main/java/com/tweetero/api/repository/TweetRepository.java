package com.tweetero.api.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tweetero.api.model.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
    @Query("FROM Tweet t " + 
            "WHERE LOWER(t.username) like %:username%"
    )
    List<Tweet> findByUsername(String username, Pageable pageable);
}
