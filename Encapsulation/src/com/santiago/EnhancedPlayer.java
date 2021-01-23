package com.santiago;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;  //  '= 100' is a default value, if the below health won't pass the IF, see 'loseHealth' method
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints > 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        }
        //this.health = health > 0 && health <= 100 ? health : 0;
        this.weapon = weapon;
    }

    // since we're using encapsulation, the only way to change a player's health is by using this method, which is good!
    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives for the player
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
