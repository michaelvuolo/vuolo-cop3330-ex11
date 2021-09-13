/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // record euros
        System.out.print("How many euros are you exchanging? ");
        double euros = input.nextDouble();

        // record exchange rate
        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();

        // convert euros to usd
        double conversion = euros * rate;

        // output conversion
        System.out.print(String.format("%.0f", euros) + " euros at an exchange rate of " + rate + " is" + "\n" + String.format("%.2f", conversion) + " U.S. dollars.");
    }
}
