package com.santiago;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        //below the same outoput as in the WHILE loop
        for (int i = 1; i != 6; i++) {
            System.out.println("count value is " + i);
        }

        count = 1;

        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100){
                break;
            } // this is to stop an inifinite loop, not necessary tho.

        } while (count !=6);

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
    }



    public static boolean isEvenNumber (int number) {
        if((number %2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
