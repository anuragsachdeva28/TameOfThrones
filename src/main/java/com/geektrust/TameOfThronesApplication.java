package com.geektrust;

import com.geektrust.data.AlliedKingdom;
import com.geektrust.data.Kingdom;
import com.geektrust.data.KingdomData;
import com.geektrust.service.Alliance;
import com.geektrust.service.AllianceImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class TameOfThronesApplication {
    public static void main(String[] args) throws IOException {

        Alliance alliance = new AllianceImpl();
        AlliedKingdom alliedKingdom = new AlliedKingdom();

        File file = new File(args[0]);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String kingdomName = input.substring(0, input.indexOf(" "));
            String secretMessage = input.substring(input.indexOf(" ")+1);

            if(alliance.checkAlliance(kingdomName, secretMessage)) {
                alliedKingdom.addKingdom(kingdomName);
            }
        }

        alliedKingdom.displayAllies();
    }
}
