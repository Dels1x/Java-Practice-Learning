package projects.AdventureGame;

public class Slizen extends Entity {

    Slizen(String name, String description, int hp, int damage){
        this.setName(name);
        this.setDescription(description);
        this.setHP(hp);
        this.setDamage(damage);

    }

    void attack(Hero hero) {
        hero.setHP(hero.getHP() - this.dice());
        System.out.printf("Slizen attacked you! He left you %dHP \n", hero.getHP());
    }

}
