package com.example.restservice;

public class Posting {

    private final String content;
    private String time;

    public Posting(String first, String second) {
        this.time = getTime();
        this.content = first.concat(" & ").concat(second).concat(" Time: ").concat(getTime());

    }

    public String getContent() {

        return content;
    }

    public String getTime() {
        this.time = java.time.LocalTime.now().toString();
        return time;
    }
}
