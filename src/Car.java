public class Car extends Vehicle {
    int wheels = 4;
    int doors = 4;
    int pedals = 3;
    String name;

    Car(String name){
        this.name = name;
    }

    void go(){
        System.out.println(this.name+" is going!");
    }

    void stop(){
        System.out.println(this.name+" is stopped!");
    }
}
