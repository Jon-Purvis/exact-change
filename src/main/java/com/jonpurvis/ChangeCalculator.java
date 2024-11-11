package com.jonpurvis;

public class ChangeCalculator {
    public void calculateChange(double input) {
        // Round to avoid weird floating point issue and convert to cents
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

    // return the remaining cents after calculating the change.
    protected int calculateAndPrintChange(int cents, int denomination, String denominationName) {
        int count = cents / denomination;
        cents = cents - (denomination * count);

        if (count > 0) {
            System.out.println(denominationName + ": " + count);
        }

        return cents;
    }
}
