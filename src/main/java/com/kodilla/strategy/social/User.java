package com.kodilla.strategy.social;

public sealed class User
    permits ZGeneration, YGeneration, Millenials{
    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void share(){
        socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
