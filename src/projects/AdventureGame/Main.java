package projects.AdventureGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?:");
        String name = scanner.nextLine();

        Hero player = new Hero(name, "Some guy.", 100, 5);
        Slizen slizen = new Slizen("Slizen", "eblan", 12, 2);
        Ohrimchuk pidor = new Ohrimchuk("Ohrimchuk", "uebok suka", 100, 6);

        System.out.println(player);

        System.out.println(name+", let's go to your first mission! Kill 5 slizens!");

        System.out.println("Press ENTER to continue: ");
        scanner.nextLine();

        for(int i = 0; i < 5; i++ ){
            while (slizen.getHP() > 0 && player.getHP() > 0) {
                player.attack(slizen);
                slizen.attack(player);
                System.out.println("Press ENTER to continue: ");
                scanner.nextLine();
            }
            player.setDamage(player.getDamage()+1);
            System.out.println("You killed slizen! As reward you get +1 to your damage");
            slizen.setHP(12);
            System.out.println("Press ENTER to continue: ");
            scanner.nextLine();
        }


        System.out.println("BOSS TIME!");
        System.out.println("Kill ohrimchuk and get KSIVA!");
        System.out.println("Press ENTER to continue: ");
        scanner.nextLine();
        player.setHP(100);

        while (slizen.getHP() > 0 && player.getHP() > 0) {
            player.attack(pidor);
            pidor.attack(player);
            System.out.println("Press ENTER to continue: ");
            scanner.nextLine();
        }

        if (player.getHP() > pidor.getHP()) {
            System.out.println("You completed the game! You got KSIVA from Ohrimchuk and beat his ass! Congratulations, " + name + "!");
        }
        else {
            System.out.println("You lost to pidoras \"ohrimchuk\". What a shame.");
        }
        System.out.println("Press ENTER to exit the game: ");
        scanner.nextLine();


    }
}
