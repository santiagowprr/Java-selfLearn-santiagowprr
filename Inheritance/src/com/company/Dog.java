package com.company;

public class Dog extends Animal { // if we want to inherit from another class (be able to access some states or behaviours that are in another class we use 'extends'

    private int eyes;
    private int legs;
    private int tile;
    private int teeth;
    private String coat;


    // below are the basic characteristics of an animal (name, barin etc.). 'super' means that we're calling the constructor that this class is extending (inheriting) from
    //here we're adding some features specific to the dog, not only to the generic Animal class
    //since all animals do have a brain and body, we're not inserting them as a necessary parameter (in the brackets), bu instead we 've inserted '1' as a default, see below.
    public Dog(String name, int size, int weight, int eyes, int legs, int tile, int teeth, String coat) {
        super(name, 1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tile = tile;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }


    // below we are overriding 'eat' method that was in Animal class, we're going to make this method unique to the Dog class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();    //   here 'super' means Java needs to look at the class that this class is extending from, and do what's written in that method
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);   //  here we could use 'super.move()', but it's beter to use just 'move'
    }
    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
}
