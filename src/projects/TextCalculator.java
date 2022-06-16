package projects;

import java.util.Scanner;

public class TextCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st integer: ");
        long x = scanner.nextLong();
        System.out.println("Enter 2nd integer: ");
        long y = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter what you want to do with the numbers (+ - * /): ");
        String z = scanner.nextLine();

        switch (z) {
            case "+" -> System.out.println(x + y);
            case "-" -> System.out.println(x - y);
            case "*" -> System.out.println(x * y);
            case "/" -> System.out.println(x / y);
        }

    }
}
