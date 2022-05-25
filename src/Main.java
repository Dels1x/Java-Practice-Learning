import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // array = you already know what array is you fucking retard you learned python dumbass

        String[] cars = {"Hyndai Tiburon", "Audi TT", "Toyota Corolla", "Peugeot 206"};

        for(int i = 0; i < 4; i++){
            System.out.println(cars[i]);
        }

        cars[2] = "Nissan 370Z";

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        
        System.out.println(cars);


        int[] years = new int[4];

        years[0] = 2004;
        years[1] = 2007;
        years[2] = 2004;
        years[3] = 2003;

        for(int i = 0; i < years.length; i++){
            System.out.println(years[i]);
        }
    }
}
