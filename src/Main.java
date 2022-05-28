import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, coffee cup, bottle)

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println(myCar1.year);
        System.out.println(myCar1.color);

        myCar1.brake();


        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.year);
        System.out.println(myCar2.color);

        myCar2.brake();

    }


}
