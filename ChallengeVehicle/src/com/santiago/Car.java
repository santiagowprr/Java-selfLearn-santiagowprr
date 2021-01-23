package com.santiago;

public class Car extends Vehicle {

    private int gears;
    private int doorNumber;
    private String brand;

    public Car(){

    }

    public Car(int gears, int doorNumber, String brand) {
        this.gears = gears;
        this.doorNumber = doorNumber;
        this.brand = brand;
    }

    public Car(int size, int seats, int capacity, int gears, int doorNumber, String brand) {
        super(size, seats, capacity);
        this.gears = gears;
        this.doorNumber = doorNumber;
        this.brand = brand;
    }
}
