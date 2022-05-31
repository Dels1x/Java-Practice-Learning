import package2.C;

public class Main {

    public static void main(String[] args) {

        // Encapsulation = attributes of the class will be hidden or private,
        //                 can be accessed only trough methods (getters and setters).
        //                 you should make attributes private if you don't have a reason to make them public/protected

        Car car = new Car("Dodge", "Challenger", 2019);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }


}
