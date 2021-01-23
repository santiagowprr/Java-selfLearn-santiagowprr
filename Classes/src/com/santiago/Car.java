package com.santiago;

import java.util.Locale;

public class Car { // "public" - unrestricted to anyone

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    // these variables are the state component for a Car, are the characteristic of a car

    // we want to allow a method to update the car's model:
    public void setModel(String model) {  //  we've just created a SETTER
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() { // this is a GETTER
        return this.model;
    }
}
