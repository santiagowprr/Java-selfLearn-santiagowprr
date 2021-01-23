package com.company;

public class Main {

    // Phones and computers are similar in a way that they share similar hardware - RAM, Processor eg. Mac and LG G6.
    //They share similar characteristics, yet teach of them add additional features, that collectively make them different from each other
    // eg. a Mac runs MacOS, has USB ports, has Intel Processor. Android phone has Android and has Touchscreen for import
    // animals can move, but not all have legs, not all have eyes (like some spiders).

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "ong silky");

        dog.eat(); // we've used a method that was not declared directly in the Animal class, but in Animal class
        dog.walk();
        dog.run();
    }
}
