import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // polymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        // ex. A corvette is a: corvette, a car, a vehicle and an object

        Scanner scanner = new Scanner(System.in);
        Animal animal;  // we declare animal class, as we don't know what user will pick

        System.out.println("What pet do you want?");
        System.out.print("1=cat, 2=dog: ");
        int choice =  scanner.nextInt();

        if(choice==1) {
            animal = new Cat();
        }
        else {
            animal = new Dog();
        }

        animal.speak();


    }


}
