package com.geektrust.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlliedKingdom {

    private List<String> alliedKingdom = new ArrayList<>();

    /**
     * addKingdom() adds a particular kingdom to list when provided a name.
     *
     * @param kingdomName
     */
    public void addKingdom(String kingdomName) {
        if (kingdomName != null) {
            alliedKingdom.add(kingdomName);
        }
    }

    /**
     * displayAllies() prints the name of Allies if King Shan gets
     * to form alliance with 3 or more kingdoms else prints NONE.
     */
    public void displayAllies() {
        int numberOfAllies = alliedKingdom.size();
        String allies = "NONE";
        if (numberOfAllies >= 3) {
            allies = String.join(" ", alliedKingdom);
            allies = "SPACE " + allies;
        }
        System.out.println(allies);
    }
}
