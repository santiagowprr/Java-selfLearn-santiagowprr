package com.santiago;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // we're checking if the input of the user was an int

        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age);
            } else {
                System.out.println("Invalid YOB");
            }

        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close(); // we need to close the scanner to save some memory
    }
}
