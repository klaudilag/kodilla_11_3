package com.kodilla.strategy.social;

public final class ZGeneration extends User{
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
