package com.geektrust.data;

public class Kingdom {
    private String name;
    private String emblem;

    Kingdom(String name, String emblem) {
        this.name = name;
        this.emblem = emblem;
    }

    public String getEmblem() {
        return this.emblem;
    }

    public int getCipherKey() {
        return this.emblem.length();
    }
}
