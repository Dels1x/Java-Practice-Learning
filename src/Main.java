public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Danislav", 17, 57.5);
        Human human2 = new Human("Igor", 13, 47.7);

        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);
        System.out.println();
        System.out.println();
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);

        human2.eat();
        human1.drink();



    }


}
