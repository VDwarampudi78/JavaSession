package org.example;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Declaring and initializing variables
        double principal = 1000;  // Principal amount in currency
        double rate = 10;
        // Interest rate in percentage
        double time = 3;
        // Time period in years

        // Calculating Simple Interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Printing the result
        System.out.print("Principal: " + principal + ", ");
        System.out.print("Rate: " + rate + "%, ");
        System.out.print("Time: " + time + " years, ");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

