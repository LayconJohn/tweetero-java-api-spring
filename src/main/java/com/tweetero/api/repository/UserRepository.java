package com.tweetero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetero.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
