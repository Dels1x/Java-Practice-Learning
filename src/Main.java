public class Main {

    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member

        Garage garage = new Garage();
        Car car1 = new Car("Opel", "Astra");
        Car car2 = new Car("Peugeot", "206");

        garage.park(car1);
        garage.park(car2);


    }


}
