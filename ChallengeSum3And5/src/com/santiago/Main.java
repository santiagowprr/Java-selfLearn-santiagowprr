package com.santiago;

public class Main {

    public static void main(String[] args) {

    int divisableBy3And5 = 0;
    int SumDivisableBy3And5 = 0;
	for (int i = 1; i <= 1000; i++){
	    if ((i % 3 == 0) && (i % 5 == 0)){
            System.out.println(i + " can be divided by 3 and 5");
            divisableBy3And5++;
            SumDivisableBy3And5 += i;
            if (divisableBy3And5 == 5) {
                System.out.println("The sum of those numbers is " + SumDivisableBy3And5);
                break;
            }

        }
    }
    }
}
