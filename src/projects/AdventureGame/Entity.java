package projects.AdventureGame;

public abstract class Entity {

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
        this.name = name;
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
        return this.name + "\n" + this.description + "\n" + this.hp + "\n" + this.damage;
    }

}
