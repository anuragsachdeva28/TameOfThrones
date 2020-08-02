package com.geektrust.data;

import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@EqualsAndHashCode
public class Kingdom {
    private String name;
    private String emblem;

    private Set<String> alliedKingdoms;


    public Kingdom(String name, String emblem) {
        this.name = name;
        this.emblem = emblem;
        this.alliedKingdoms = new LinkedHashSet<>(Collections.singletonList(name));
    }

    /**
     * getter method for the alliedKingdom Set.
     *
     * @return
     */
    public Set<String> getAlliedKingdoms() {
        return alliedKingdoms;
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

    /**
     * Method to add allied kingdom to the list of alliedKingdoms
     *
     * @param kingdomName
     */
    public void addAlliedKingdom(String kingdomName) {
        if (kingdomName != null) {
            alliedKingdoms.add(kingdomName);
        }
    }

    /**
     * Method to display allies according to the given criteria in the question
     */
    public void displayAllies() {
        int numberOfAllies = alliedKingdoms.size();
        String allies = "NONE";
        if (numberOfAllies > 3) {
            allies = String.join(" ", alliedKingdoms);
        }
        System.out.println(allies);
    }
}
