package com.mycompany.patterns.observer;

public interface PostSubject {
    void addObserver(FollowerObserver follower);
    void removeObserver(FollowerObserver follower);
    void notifyFollowers(String postId);
}
