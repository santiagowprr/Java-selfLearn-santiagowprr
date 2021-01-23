package com.santiago;

public class Player {
    public String name;  //  if we changed something here (eg. 'name' for 'fullName') we would've had to change that field also in the Main class (there's player.name = "Tim" there, not player.fullName)
    // it means that everytime we change smth we'd need to correct stuff in other classes as well (in big apps would be problematic)
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("Player knocked out");
            // Reduce number of lives for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }


}
