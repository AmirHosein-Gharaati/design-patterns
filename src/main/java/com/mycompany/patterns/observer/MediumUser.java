package com.mycompany.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MediumUser implements PostSubject {
    private final List<FollowerObserver> followers;

    public MediumUser() {
        this.followers = new ArrayList<>();
    }

    @Override
    public void addObserver(FollowerObserver follower) {
        followers.add(follower);
    }

    @Override
    public void removeObserver(FollowerObserver follower) {
        followers.remove(follower);
    }

    @Override
    public void notifyFollowers(String postId) {
        followers.forEach(follower -> follower.sendEmail(postId));
    }
}
