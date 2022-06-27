import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.println(bmi(58, 1.85));

    }

    public static String bmi(double weight, double height) {
        double bmi = weight / (height*height);
        System.out.println(bmi);

        if(bmi <= 18.5) return "Underweight";
        else if(bmi <= 25) return "Normal";
        else if(bmi <= 30) return "Overweight";
        else return "Obese";

    }

}