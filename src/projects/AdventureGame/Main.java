package projects.AdventureGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?:");
        String name = scanner.nextLine();

        Hero player = new Hero(name, "Some guy.", 100, 5);

        System.out.println(player);

    }
}
