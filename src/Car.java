public class Car extends Vehicle {

    public volatile int i = 0;

    public void go() {
        System.out.println("The car is going");
    }

}
