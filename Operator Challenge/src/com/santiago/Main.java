package com.santiago;

public class Main {

    public static void main(String[] args) {
	double myDouble = 20.00d;
	double myDoubleTwo = 80.00d;

    double result = (myDouble + myDoubleTwo) * 100;

    double resultModulus = result % 40;

    boolean isNoRemainder = (resultModulus == 0) ? true : false;

    System.out.println(isNoRemainder);

    if (!isNoRemainder) {
        System.out.println("Got some remainder");
    }


    }
}
