package com.example.neeraj.myapplication.backend;

import com.example.JokeTeller;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    public String getData() {
        return JokeTeller.getJokes;
    }
}