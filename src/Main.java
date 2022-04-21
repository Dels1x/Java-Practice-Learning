import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        short age = scanner.nextShort();
        scanner.nextLine();
        System.out.println("What is your GPU");
        String gpu = scanner.nextLine();

        System.out.printf("Your name is %s\n", name);
        System.out.printf("You are %2d years old\n", age);
        System.out.printf("Your GPU is %s\n", gpu);

    }
}