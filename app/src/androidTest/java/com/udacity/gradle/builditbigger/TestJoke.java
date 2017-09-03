package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import org.junit.Assert;

public class TestJoke extends AndroidTestCase {

    public void testJokeFetching(){
        new jokeEndpoint(new callbackInterface() {
            @Override
            public void onJokeLoaded(String joke) {
                Assert.assertNotEquals(joke, "");
            }
        }).execute();
    }
}
