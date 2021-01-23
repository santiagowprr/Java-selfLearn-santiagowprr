package com.santiago;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75); //this is how we access the 2nd method, we put just one parameter
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    } // we've removed one parameter from the method above thus making it clear which method do we mean by looking at the parameter number

    public static int calculateScore() { // no parameters
        System.out.println("No player, no score");
        return 0;
    }

    //public static void calculateScore() { // even if we change the return type from 'int' to 'void', it won't let us create a new method like that
      //  System.out.println("No player, no score");
//    }
}


// method overloading - used commonly. option when we use same method name but with different parameters