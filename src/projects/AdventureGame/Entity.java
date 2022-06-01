package projects.AdventureGame;

import java.util.Random;

public abstract class Entity {

    Random random = new Random();

    private String name;
    private String description;
    private int hp;
    private int damage;

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getHP() {
        return this.hp;
    }

    public int getDamage() {
        return this.damage;
    }
    public void setName(String name) {
        if(!name.isBlank()) {
            this.name = name;
        }
        else{
            System.out.println("You entered blank name! So you will be called dolboeb");
            this.name = "dolboeb";
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String toString() {
        return "Name: "+this.name + "\nDescription: " + this.description + "\nHP: " + this.hp + "\nDamage: " + this.damage;
    }

    public int dice() {
        int number = random.nextInt(12)+1;
        System.out.println("Rolling dice... Dice says: "+number);
        return number+1+this.damage;
    }

}
