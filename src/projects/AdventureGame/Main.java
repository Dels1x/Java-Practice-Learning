package projects.AdventureGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?:");
        String name = scanner.nextLine();

        Hero player = new Hero(name, "Some guy.", 100, 5);
        Slizen slizen = new Slizen("Slizen", "eblan", 12, 2);

        System.out.println(player);

        System.out.println("Let's go to your first mission! Kill 5 slizens!");

        while(slizen.getHP() > 0 && player.getHP() > 0) {
            player.attack(slizen);
        }

    }
}
