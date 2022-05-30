public class Hero extends Person{
    String superpower;


    Hero(String name, int age, String superpower) {
        super(name, age);
        this.superpower = superpower;
    }

    public String toString() {
        return super.toString() + this.superpower + "\n";
    }
}
