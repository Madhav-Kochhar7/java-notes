package com.streamify.music.models;

public class song {
    private String name;
    private int streams;
    public String genre = "pop";

    public song(String name, int streams){
        this.name = name;
        this.streams= streams;
    }

    void getName(){
        System.out.println("Song : " + name);
    }

    public void showSummary(){
        System.out.println("Name : " + name);
        System.out.println("Streams : "+ streams);
    }
}
