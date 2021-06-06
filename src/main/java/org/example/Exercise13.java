/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 13 - Determining compound interest

package org.example;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        //Read in input from user about interest/years
        Scanner getNumbers = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        Integer principal = getNumbers.nextInt();
        System.out.print("What is the rate? ");
        double rate_interest = getNumbers.nextDouble();
        System.out.print("What is the number of years? ");
        Integer number_years = getNumbers.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        Integer number_compounded_peryear = getNumbers.nextInt();

        //Calculations
        double rate_final = rate_interest / 100;
        double total_worth = principal*Math.pow(1 + (rate_final / number_compounded_peryear),number_compounded_peryear*number_years);

        // Print out statement
        System.out.println(String.format("$%d invested at %.02f%% for %d years compounded %d times per year is %.02f.",
                principal, rate_interest, number_years, number_compounded_peryear, total_worth));
    }
}
