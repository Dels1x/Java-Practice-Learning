public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car1 = new Car("Opel");
        Car car2 = new Car("Peugeot 206");

        garage.park(car1);
        garage.park(car2);


    }


}
