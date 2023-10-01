package com.mycompany.patterns.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserFollower implements FollowerObserver {
    private final String username;

    @Override
    public void sendEmail(String postId) {
        System.out.println(username + " received an email about new post with id: " + postId);
    }
}
