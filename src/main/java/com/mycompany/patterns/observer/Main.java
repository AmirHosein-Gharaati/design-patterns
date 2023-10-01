package com.mycompany.patterns.observer;

public class Main {
    public static void main(String[] args) {
        MediumUser user = new MediumUser();

        FollowerObserver followerObserver1 = new UserFollower("followerObserver1");
        FollowerObserver followerObserver2 = new UserFollower("followerObserver2");
        FollowerObserver followerObserver3 = new UserFollower("followerObserver3");

        user.addObserver(followerObserver1);
        user.addObserver(followerObserver2);
        user.addObserver(followerObserver3);

        String postId = "123";
        user.notifyFollowers(postId);

        user.removeObserver(followerObserver2);

        String newPostId = "456";
        user.notifyFollowers(newPostId);
    }
}
