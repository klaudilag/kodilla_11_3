package com.kodilla.strategy.social;

public final class YGeneration extends User{
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
