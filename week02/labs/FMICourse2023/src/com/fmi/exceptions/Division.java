package com.fmi.exceptions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to divide:");
        int dividend = input.nextInt();
        int divisor = input.nextInt();

        try {
            int quotient = dividend / divisor;
            System.out.println("Result: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
