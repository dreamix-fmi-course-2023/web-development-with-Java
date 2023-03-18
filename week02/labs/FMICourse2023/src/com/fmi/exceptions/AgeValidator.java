package com.fmi.exceptions;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");

        try {
            int age = validateAge(input);
            System.out.println("Valid age entered: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Greda");
            System.out.println(e.getMessage());
        }
    }

    public  static int validateAge(Scanner input ) throws InvalidAgeException {
        int age = input.nextInt();
        if (age < 0 || age > 120) {
//            throw new InvalidAgeException("Invalid age entered.");
            throw new InvalidAgeException(new Exception("Invalid age entered."));
        }
        return age;
    }
}
