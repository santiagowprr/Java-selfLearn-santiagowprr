package com.santiago;

public class Main {

    public static void main(String[] args) {  // this is the method 'main', which consists of all the below statements.
        //int int = 5;  // we can't use a reserved keyword to name variables - https://en.wikipedia.org/wiki/List_of_Java_keywords
        // a mile = 1.609344 kilometers
//        double kilometers = (100 * 1.609344);
//        int highscore = 50;
//
//        if (highscore == 50) {
//            System.out.println("This is an expression"); // "this is an expression' is an expression
//        }
//
//        int myVariable = 50; // this is a statement
//        myVariable++;// this is a statement
//        System.out.println("This is " +
//                "another " +
//                "still more" +
//                "");  //  prints normally "This is another still more'

        // WHITE SPACE
        // space between eg . 'int myVariable'

       // CODE BLOCKS
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;


//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but more than 1000");
//        } else if (score < 1000){
//            System.out.println("tour score is lesser than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        int highscore = calculateScore( gameOver, score, levelCompleted, bonus ); // 'take the return of this method and put it into the variable "highscore" '
        System.out.println("Your final score was " + highscore);

        //*************** below code is redundant! ***************************************************//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
        // int savedFinalScore = finalScore; // Java cannot access 'finalScore', because it is stored in the IF above, and gets dewleted once the IF gets executed
        //*************** above code is redundant! ***************************************************//

        highscore = calculateScore(true, 10000, 8, 200 );
        System.out.println("Your final score was " + highscore);

    }

    //we can't put a method within another method (so we cant put it inside 'main' method in this case)



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        //here, 'int' (instead of 'void') means that the method returns an int value

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1; //we needed to add what the method has to return if the IF won't be execute (thus making it impossible to get to the 'return' statement).
        // we could also use the 'else' statement here (else return -1). We use '-1' bc in programming terms it indicates an error. invalid value or value not found.


    }
 // 'procedure' is another way of saying 'void method'




}
