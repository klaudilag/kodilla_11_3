package com.kodilla.strategy.social;

public final class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "napisane na facebooku";
    }
}
