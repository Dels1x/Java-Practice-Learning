import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        String[] tower = towerBuilder(9);

        for(String i : tower) System.out.println(i);

    }

    public static String[] towerBuilder(int nFloors)
    {
        String[] tower = new String[nFloors];

        for(int i = 0; i < nFloors; i++) {
            tower[i] = " ".repeat(nFloors-i-1) + "*".repeat((i*2)+1) + " ".repeat(nFloors-i-1);
        }

        return tower;
    }

}
