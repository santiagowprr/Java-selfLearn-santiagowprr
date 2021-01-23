package com.santiago;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
        // for (init; termination/condition; increment){}  //  to increment more than 1 we do eg.: i += 2
        for (int i=1; i<=8; i++){  // btw. the 'i' variable exists only in this IF statement.
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
        for (int i=8; i>=1; i--){  // btw. the 'i' variable exists only in this IF statement.
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        int primeCount = 0;
        for (int i=10; i<50; i++){
            if (isPrime(i)){
                System.out.println(i + " is a prime number");
                primeCount++;
                if (primeCount == 3){
                    break;
                }
            }
        }

    }
    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime (int n) {
        if (n==1) {
            return false;
        }

        for (int i=2; i<=n/2; i++) { // in the 'termination' section we could optimise the for loop as follows: (long) Math.sqrt(n). Thanks to that the program doesnt have to do so many loops (iterations) to check the numbers.
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
