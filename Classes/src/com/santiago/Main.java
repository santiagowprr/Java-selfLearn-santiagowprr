package com.santiago;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();// this is an object of type 'Car', called 'porsche'
        Car holden = new Car();
        //porsche.equals(); // the basic methods like 'equals()' have been added to this object when created. Car class has inherited those methods from Java functionality, base Java class
        // we cannot access the methods that we've created because they are 'private'.
        // Java knows it's the Car class we've created
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel()); //  'Model is Carrera'






    }
}
