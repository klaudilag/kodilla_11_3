package com.kodilla.strategy.social;

public final class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Napisane na twitterze";
    }
}
