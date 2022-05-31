package projects.AdventureGame;

public class Hero extends Entity {

    Hero(String name, String description, int hp, int damage){
        this.setName(name);
        this.setDescription(description);
        this.setHP(hp);
        this.setDamage(damage);

    }

    void attack(Slizen slizen) {
        slizen.setHP(slizen.getHP() - this.getDamage());
        System.out.printf("You attacked slizen! You left him %dHP \n", slizen.getHP());
    }

}
