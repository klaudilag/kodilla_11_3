package com.kodilla.strategy.social;

public sealed interface SocialPublisher
    permits FacebookPublisher, TwitterPublisher, SnapchatPublisher{
    String share();
}
