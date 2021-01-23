package com.santiago;

public class Vehicle {
    private int size;
    private int seats;
    private int capacity;

    public Vehicle(){
        this.size = 1;
        this.seats = 1;
        this.capacity = 1;
    }

    public Vehicle(int size, int seats, int capacity){

    }

    public void move(int speed){
        System.out.println("The vehicle is moving at " + speed + " KM/H");
    }

    public void steer(String direction){
        System.out.println("The vehicle is moving " + direction);
    }
}
