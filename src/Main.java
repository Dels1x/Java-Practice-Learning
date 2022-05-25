import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows");
        int rows = scanner.nextInt();
        System.out.println("How many columns");
        int columns = scanner.nextInt();
        System.out.println("Enter symbol");
        scanner.nextLine();
        String symbol = scanner.nextLine();


        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
