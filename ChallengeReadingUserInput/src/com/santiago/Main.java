package com.santiago;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userScanner = new Scanner(System.in);
        int numberCount = 1;
        int numberSum = 0;
        int userNumber = 0;


        while(numberCount < 11) {
            System.out.print("Enter number #" + numberCount + ": ");
            boolean hasNextInt = userScanner.hasNextInt();// we're checking if the input of the user was an int

            if (hasNextInt) {
                userNumber = userScanner.nextInt();
                numberSum += userNumber;
                numberCount++;

            } else {
                System.out.println("Invalid number");
            }
            userScanner.nextLine();

        }
        System.out.println("The sum of user's numbers is: " + numberSum);
        userScanner.close();
    }
}
