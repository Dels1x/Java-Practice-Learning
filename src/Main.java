import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int age = 17;
        hello("delsix", age);

        System.out.println(age(5, 9));


    }

    static void hello(String name, int age){
        System.out.println("Hello "+name+"!");
        System.out.println("You are " +age+" years old!");
    }

    static int age(int x, int y) {
        return x+y;
    }
}
