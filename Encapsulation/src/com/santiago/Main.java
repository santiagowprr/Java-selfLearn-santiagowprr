package com.santiago;

public class Main {

    // ENCAPSULATION - mechanism that allows to restrict access to certain components in the objects that we're creating.
    // we can protect the members of the class from external access in order to guard against unauthorized access.
    // it's not a security feature, we're just stopping classess outside of the class that we're working on from accessing the inner workings of a class
    // it gives more control and allows to change stuff without breaking the code

    public static void main(String[] args) {

    	// IN THE CODE BELOW we can access too much and have too much control of the object
//	    Player player = new Player();
//
//	    // since the acces smodifiers in the Player class are 'public' we can access those fields directly
//	    player.name = "Tim";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage=11;
//        player.health = 200; // if it wasn't for that, the player would've died, we wouldn't be able to do that if we used encapsulation
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());


		// CODE BELOW IS A GOOD EXAMPLE HOW TO FIX TOO MUCH CONTROL USING ENCAPSULATION

	EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
		System.out.println("Initial health is " + player.getHitPoints());

    }
}
