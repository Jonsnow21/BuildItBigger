package com.example.neeraj.myapplication.backend;

import com.example.JokeTeller;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String data;

    public String getData() {
        return JokeTeller.getJoke();
    }

    public void setData(String data) {
        this.data = data;
    }
}