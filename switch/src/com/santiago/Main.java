package com.santiago;

public class Main {

    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break; // IMPORTANT TO PUT BREAK AT THE END OF CASE
            case 2:
                System.out.println("value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("it was 3,4,or5");
                break;
            default:
                System.out.println("was not 1, 2,3,4,5");
                break;

        }

        //CHALLENGE
        char charValue = 'Z'; // FOR CHAR WE USE SINGLE QUOTES
        switch (charValue) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("it was not A, B, or C");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            default:
                System.out.println("sth else");
                break;
        }

    }


}
