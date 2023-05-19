package com.kodilla.strategy.social;

public final class SnapchatPublisher implements SocialPublisher{

    @Override
    public String share() {
        return "napisane na snapie";
    }
}
