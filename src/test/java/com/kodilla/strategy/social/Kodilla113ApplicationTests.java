package com.kodilla.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        User user1 = new Millenials("Andrzej");
        User user2 = new YGeneration("Piotrek");
        User user3 = new ZGeneration("Alicja");
        Assertions.assertEquals("napisane na facebooku", user1.socialPublisher.share());
        Assertions.assertEquals("Napisane na twitterze", user2.socialPublisher.share());
        Assertions.assertEquals("napisane na snapie", user3.socialPublisher.share());
    }
    @Test
    void testIndividualSharingStrategy(){
        User user = new ZGeneration("Student");
        user.setSocialPublisher(new TwitterPublisher());
        Assertions.assertEquals(user.socialPublisher.share(), "Napisane na twitterze");
    }

}
