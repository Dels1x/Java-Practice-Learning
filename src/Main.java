import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"NORTH", "NORTH", "SOUTH", "SOUTH", "WEST", "NORTH", "EAST"})));

    }
}

class Kata {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        for(int i = 1; i < list.size(); i++) {
            if((list.get(i).equals("NORTH") && list.get(i-1).equals("SOUTH")) ||
               (list.get(i).equals("SOUTH") && list.get(i-1).equals("NORTH")) ||
               (list.get(i).equals("EAST") && list.get(i-1).equals("WEST")) ||
               (list.get(i).equals("WEST") && list.get(i-1).equals("EAST"))) {
                System.out.println("tf");
                    list.remove(i);
                    list.remove(i-1);
                    i = 0;
            }
        }

        return list.toArray(new String[0]);
    }
}