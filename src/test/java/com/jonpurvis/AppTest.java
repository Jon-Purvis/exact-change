package com.jonpurvis;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest {

    /* preface: I have used JUnit before, but never to test printed output.
    //          I found some of the code for these tests related to simulating
    //          user input with `ByteArrayOutputStream on stackoverflow.
    */

    // Test case for input 0.00 
    @Test
    public void testCalculateChangeZero() {
        ChangeCalculator calculator = new ChangeCalculator();
        // Simulate user input
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));  
        // Run method and assert correct output
        calculator.calculateChange(0);
        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString().trim());
        // Reset System.out
        System.setOut(System.out);  
    }

    // Test case for "normal" input 19.99 
    @Test
    public void testCalculateChange19_99() {
        ChangeCalculator calculator = new ChangeCalculator();
        // Simulate user input
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));  
        // Run method and assert correct output
        calculator.calculateChange(19.99);
        String expectedOutput = "$10 bill: 1\n$5 bill: 1\n$1 bill: 4\nQuarter: 3\nDime: 2\nPenny: 4";
        assertEquals(expectedOutput, outContent.toString().trim());
        // Reset System.out
        System.setOut(System.out);  
    }

    // Test case for large input 884.93
    @Test
    public void testCalculateChange884_93() {
        ChangeCalculator calculator = new ChangeCalculator();
        // Simulate user input
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));  
        // Run method and assert correct output
        calculator.calculateChange(884.93);
        String expectedOutput = "$100 bill: 8\n$50 bill: 1\n$20 bill: 1\n$10 bill: 1\n$1 bill: 4\n" +
                                "Quarter: 3\nDime: 1\nNickel: 1\nPenny: 3";
        assertEquals(expectedOutput, outContent.toString().trim());
        // Reset System.out
        System.setOut(System.out);  
    }

    // Test case for input with only one decimal place 152.8 
    @Test
    public void testCalculateChange152_8() {
        ChangeCalculator calculator = new ChangeCalculator();
        // Simulate user input
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));  
        // Run method and assert correct output
        calculator.calculateChange(152.8);
        String expectedOutput = "$100 bill: 1\n$50 bill: 1\n$1 bill: 2\nQuarter: 3\nNickel: 1";
        assertEquals(expectedOutput, outContent.toString().trim());
        // Reset System.out
        System.setOut(System.out);  
    }

    // Test case for input without decimal 18
    @Test
    public void testCalculateChange18() {
        ChangeCalculator calculator = new ChangeCalculator();
        // Simulate user input
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));  
        // Run method and assert correct output
        calculator.calculateChange(18);
        String expectedOutput = "$10 bill: 1\n$5 bill: 1\n$1 bill: 3";
        assertEquals(expectedOutput, outContent.toString().trim());
        // Reset System.out
        System.setOut(System.out);  
    }
}