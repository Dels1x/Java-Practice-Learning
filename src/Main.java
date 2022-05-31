import package2.C;

public class Main {

    public static void main(String[] args) {

        // Encapsulation = attributes of the class will be hidden or private,
        //                 can be accessed only trough methods (getters and setters).
        //                 you should make attributes private if you don't have a reason to make them public/protected

        Car car1 = new Car("Dodge", "Challenger", 2019);
        Car car2 = new Car("Nissan", "370Z", 2004);

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear()+"\n");

        car1.setYear(2022);

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        car1.setMake("");
        car1.setModel("");
        car1.setYear(228);

        System.out.println(car1);
        System.out.println(car2);

        // don't do car1 = car2 to copy objects. because they will share the same adress in memory. so it's not really
        // copy. it's more like another name for the same object

        car2.copy(car1); // do this instead
        Car car3 = new Car(car1); // or this

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        //xd

    }


}
