package com.jonpurvis;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double input = getInput();
        calculateChange(input);
    }

    private static double getInput() {
        double usd = -1; 
        Scanner scanner = new Scanner(System.in);

        // Loop until a valid USD amount is entered (positive value)
        while (usd <= 0) {
            System.out.print("Enter a positive monetary value (in USD): ");
            if (scanner.hasNextDouble()) {
                usd = scanner.nextDouble();
            } else {
                System.out.println("Please enter a valid number.");
                // Clear the invalid input
                scanner.next(); 
            }
        }
        scanner.close();
        return usd;
    }

    private static void calculateChange(double input) {
        // Round to avoid weird floating point issue and then convert to cents
        int cents = (int)Math.round(input * 100);  

        cents = calculateAndPrintChange(cents, 10000, "$100 bill");
        cents = calculateAndPrintChange(cents, 5000, "$50 bill");
        cents = calculateAndPrintChange(cents, 2000, "$20 bill");
        cents = calculateAndPrintChange(cents, 1000, "$10 bill");
        cents = calculateAndPrintChange(cents, 500, "$5 bill");
        cents = calculateAndPrintChange(cents, 100, "$1 bill");
        cents = calculateAndPrintChange(cents, 25, "Quarter");
        cents = calculateAndPrintChange(cents, 10, "Dime");
        cents = calculateAndPrintChange(cents, 5, "Nickel");
        cents = calculateAndPrintChange(cents, 1, "Penny");
    }

    private static int calculateAndPrintChange(int cents, int denomination, String denominationName) {
        int count = cents / denomination; 
        // update cents  
        cents = cents - (denomination * count);  

        if (count > 0) {
            System.out.println(denominationName + ": " + count);
        }
        // return remaining cents
        return cents;  
    }
}