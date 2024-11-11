package com.jonpurvis;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = getInput(scanner);
        ChangeCalculator calculator = new ChangeCalculator();
        calculator.calculateChange(input);
        scanner.close();
    }

    protected static double getInput(Scanner scanner) {
        double usd = -1;

        // Loop until a valid USD amount is entered (positive value)
        while (usd <= 0) {
            System.out.print("Enter a positive monetary value (in USD): ");
            if (scanner.hasNextDouble()) {
                usd = scanner.nextDouble();
            } else {
                System.out.println("Please enter a valid number.");
                // Clear invalid input
                scanner.next(); 
            }
        }
        return usd;
    }
}