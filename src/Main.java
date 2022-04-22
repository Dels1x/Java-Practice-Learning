import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x = 3.14;
        byte y = -10;
        int z = 6;

        double min = Math.min(x, y);
        double max = Math.max(x, y);
        double y_abs = Math.abs(y);
        double sqrt = Math.sqrt(z);
        long round = Math.round(x);
        long ceil = (long) Math.ceil(x);
        long floor = (long) Math.floor(x);


        System.out.printf("min: %f max: %f abs of y: %f koren' %f round %2d ceil %2d floor %2d", min, max, y_abs, sqrt, round, ceil, floor);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x:");
        double a = scanner.nextDouble();
        System.out.println("Enter side y:");
        double b = scanner.nextDouble();

        double c = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is "+c);

        // kirill lox

    }
}
