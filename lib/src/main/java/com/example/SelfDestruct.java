package com.example;

import java.util.Scanner;


public class SelfDestruct {

    public static void main(String[] args){
     String txtOfficer = "";
     String txtCode = "";
     Integer nConfirmed = 0;
     Integer nTry = 1;
     Boolean nFound = false;
     String[] sAvailOfficers = {"Sam","Bob","Charlie"};
     String[] sOfficerCode = {"001","002","003"};
     Scanner in = new Scanner(System.in);

        while (nConfirmed < 3)  {
            System.out.println("Enter Officer Name: ");
            txtOfficer = in.nextLine();

            if((txtOfficer.contentEquals("Cancel"))) {
                System.out.println("Self Destruct Canceled.");
                return;
            }
            System.out.println("Enter Code: ");
            txtCode = in.nextLine();

            //perform security check
            nFound = false;
            for (int i = 0; i < 3 ; i++) {
                if(sAvailOfficers[i].equalsIgnoreCase(txtOfficer) && (sOfficerCode[i].equalsIgnoreCase(txtCode))){
                    nConfirmed++;
                    nFound = true;
                }

            }
            if (nFound) {
                nFound = false;
                nTry = 1; // reset tries
                System.out.println("Entry " + nConfirmed   + " Confirmed");
            } else {
                if (nTry < 2) {
                    System.out.println("Error Please try name and code. Last Try.");
                    nTry++;
                } else {
                    System.out.println("Self Destruct Canceled.");
                    return;
                }
            }


        } // end while
        System.out.println("Self Destruct Activated");
        for (int i = 30; i > 0; i--) {
            System.out.println("T-minus" + i + " and counting");

        }
        System.out.println("----BOOM----");
    }
}
