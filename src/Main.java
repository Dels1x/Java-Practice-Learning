public class Main {

    public static void main(String[] args) {

        // absract =   abstract classes cannot be instantiated, but they can have a subclass (child)
        //             abstract methods are declared without implementation

        // Vehicle vehicle = new Vehicle(); ERROR
        Car car = new Car("Dodge Challenger");
        car.go(); car.stop();

    }


}
