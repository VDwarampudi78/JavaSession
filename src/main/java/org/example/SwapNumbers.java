package org.example;

public class SwapNumbers {
    public static void main(String[] args) {
        // Declaring and initializing two variables
        int num1 = 50;
        int num2 = 5;

        // Printing original values
        System.out.print("Before swap: num1 = " + num1 + ", num2 = " + num2);

        // Swapping the numbers without using a third variable
        num1 = num1 + num2;  // num1 now holds the sum of num1 and num2
        num2 = num1 - num2;  // num2 is updated to the original value of num1
        num1 = num1 - num2;  // num1 is updated to the original value of num2

        // Printing the swapped values
        System.out.print(", After swap: num1 = " + num1 + ", num2 = " + num2);
    }
}
