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

    /**
     * getEmblem() returns the emblem of the particular kingdom
     *
     * @return
     */
    public String getEmblem() {
        return this.emblem;
    }

    /**
     * getCipherKey() returns the cipher key of a particular kingdom
     *
     * @return
     */
    public String getCipherKey() {
        return Integer.toString(this.emblem.length());
    }


}
