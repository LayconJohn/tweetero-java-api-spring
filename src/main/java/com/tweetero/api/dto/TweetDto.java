package com.tweetero.api.dto;

public record TweetDto(
    String username,
    String avatar,
    String text
) {
}
