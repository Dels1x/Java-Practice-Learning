import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* logical operators = used to connect two or more expressions

                               && = (AND) both conditions must be true
                               || = (OR) one of connections must be true
                               ! = (NOT) reserves boolean value of condition */

        int temp = 26;

        if(temp >= 30) {
            System.out.println("It is hot outside!");
        }
        else if(temp >= 15 && temp < 30) {
            System.out.println("It is warm outside!");
        }
        else{
            System.out.println("It is cold oustide!");
        }

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Press Q or q to quit");
        String response = scanner.next(); //
        if(response.equals("q") || response.equals("Q")) {
            System.out.println("Bye!");
        }
        else{
            System.out.println("ok dude");
        }


    }
}
