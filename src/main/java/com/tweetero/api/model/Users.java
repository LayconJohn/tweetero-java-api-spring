package com.tweetero.api.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tweetero.api.dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@SpringBootApplication
public class Users {
    
    public Users(UserDto req) {
        this.username = req.username();
        this.avatar = req.avatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column()
    private String username;

    @Column()
    private String avatar;
}
