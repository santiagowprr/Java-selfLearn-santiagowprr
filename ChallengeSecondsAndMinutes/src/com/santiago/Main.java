package com.santiago;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(121, 1));
        System.out.println(getDurationString(65,9));


    }

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    // this is a constant ('final') method.

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
            int hours = minutes / 60;
            minutes -= (hours * 60);
            return hours + " h " + minutes + " m " + seconds + " s";
    }

    public static String getDurationString(int seconds) {
        int minutes = 0;
        if (seconds >= 0) {
            if (seconds >= 60){
                minutes = seconds / 60;
                seconds -= (minutes * 60);
                }
            return getDurationString(minutes,seconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }
    }
