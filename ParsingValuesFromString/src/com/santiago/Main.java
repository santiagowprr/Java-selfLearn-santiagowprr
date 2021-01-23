package com.santiago;

public class Main {

    public static void main(String[] args) {
	String numbersAsString = "2018"; // if we put something unacceptable such as '2028a' there will be an exception when Java will try to convert it to Int
        System.out.println("numberAsString = " + numbersAsString);

        int number = Integer.parseInt(numbersAsString); //  it will convert String to Int
        System.out.println("number " + number);

        numbersAsString += 1;
        number +=1;

        System.out.println(numbersAsString);
        System.out.println(number);
    }
}
