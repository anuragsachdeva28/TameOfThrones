package com.geektrust.data;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Kingdom {
    private String name;
    private String emblem;

    public Kingdom(String name, String emblem) {
        this.name = name;
        this.emblem = emblem;
    }

    public String getEmblem() {
        return this.emblem;
    }

    public String getCipherKey() {
        return Integer.toString(this.emblem.length());
    }


}
