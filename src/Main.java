import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x / y);
        }
        catch(ArithmeticException e) {
            System.out.println("You can divide by 0 retard");
        }
        catch(InputMismatchException e) {
            System.out.println("Enter a fricking number god damn it");
        }
        catch(Exception e) {
            System.out.println("laziness");
        }


    }


}
