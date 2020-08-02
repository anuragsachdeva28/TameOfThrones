package com.geektrust;

import com.geektrust.service.Alliance;
import com.geektrust.service.impl.AllianceImpl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Here, the sender kingdom is fixed to SPACE KINGDOM, but
 * can be changed in case the requirement changes in the future
 */
public class TameOfThronesApplication {
    public static void main(String[] args) throws IOException {

        Alliance alliance = new AllianceImpl();


        File file = new File(args[0]);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String kingdomName = input.substring(0, input.indexOf(" "));
            String secretMessage = input.substring(input.indexOf(" ") + 1);

            if (alliance.checkAlliance(kingdomName, secretMessage)) {
                alliance.addAlliance("SPACE", kingdomName);
            }
        }
        alliance.displayAllies("SPACE");
    }
}
