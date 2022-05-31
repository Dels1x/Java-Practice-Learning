package projects.AdventureGame;

public abstract class Entity {

    String name;
    String description;
    int hp;
    int damage;
    int critChance;

    abstract void attack();

}
