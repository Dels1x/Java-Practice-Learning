import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature

        double x = multiply(23.75, 25.5, 27.25);
        System.out.println(x);

    }

    static int multiply(int a, int b){
        return a*b;
    }
    static int multiply(int a, int b, int c){
        return a*b*c;
    }
    static int multiply(int a, int b, int c, int d){
        return a*b*c*d;
    }
    static double multiply(double a, double b){
        return a*b;
    }
    static double multiply(double a, double b, double c){
        return a*b*c;
    }
    static double multiply(double a, double b, double c, double d){
        return a*b*c*d;
    }


}
