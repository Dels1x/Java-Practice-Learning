import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*  ArrayList = Resizable array.
            Elements can be added and removed after compilation phase
            store reference data types                                  */

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Ice cream");
        food.add("Chips");
        food.add("Pasta");

        food.set(1, "Hamburger");
        food.remove(food.size()-1);

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        food.clear(); // removes all items from the ArrayList

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}
