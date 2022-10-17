package org.example;

import java.util.Scanner;

public class arrayTraining {

    public static void main(String[] args) {

        // something something
    }

    // a method to let the user make a string array of a given size
    public static void stringMaker() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int arraySizeRows = scan.nextInt();
        System.out.print("Number of columns: ");
        int arraySizeColumns = scan.nextInt();


        String[][] theString = new String[arraySizeRows][arraySizeColumns];

        // input strings to array
        for (int i = 0; i < arraySizeRows; i++) {
            for (int j = 0; j < arraySizeColumns; j++) {
                System.out.print("String for row " + i + " and column " + j + ": ");
                theString[i][j] = scan.nextLine();

            }

        }
        System.out.println("********************************\n");
        // output the array
        for (int i = 0; i < arraySizeRows; i++) {
            for (int j = 0; j < arraySizeColumns; j++) {
                System.out.print(theString[i][j] + "\t");

            }
            System.out.println("\n");

        }

        System.out.println("********************************");


    }


}


