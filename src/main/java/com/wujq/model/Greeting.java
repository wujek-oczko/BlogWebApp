package com.wujq.model;

public class Greeting {

    private String text;

    public Greeting() {
        this.text = "Hello there";
    }

    public Greeting(String name) {
        this.text = "Hello " + name;
    }

    public String getText() {
        return text;
    }

}