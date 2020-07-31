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

    public void addKingdom(String kingdomName) {
        if (kingdomName != null) {
            alliedKingdom.add(kingdomName);
        }
    }

    public void displayAllies() {
        int numberOfAllies = alliedKingdom.size();
        String allies = "NONE";
        if(numberOfAllies >= 3) {
            allies = String.join(" ", alliedKingdom);
            allies = "SPACE "+allies;
        }
        System.out.println(allies);
    }
}
