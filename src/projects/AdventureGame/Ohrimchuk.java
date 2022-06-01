package projects.AdventureGame;

public class Ohrimchuk extends Entity {

    Ohrimchuk(String name, String description, int hp, int damage){
        this.setName(name);
        this.setDescription(description);
        this.setHP(hp);
        this.setDamage(damage);

    }

    void attack(Hero hero) {
        hero.setHP(hero.getHP() - this.dice());
        System.out.printf("Ohrimchuk attacked you! He left you %dHP \n", hero.getHP());
    }

}
