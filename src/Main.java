import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 75) {
            System.out.println("C kakih por na kladbishe poyavilsya internet?");
        }
        else if(age >= 18) {
            System.out.println("Ebat' ti stariy!");
        }
        else {
            System.out.println("Ebat' ti molodoy!");
        }


    }
}
