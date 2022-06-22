import java.util.TreeMap;

public class Main {
    public static void main(String [] args) {

        // TreeMap is like HashMap but sorted by the way you put balues

        System.out.println(solution(14));

    }

    public static String solution(int n) {
        TreeMap<Integer, String> romanNumerals = new TreeMap<>();

        if(n > 0) {

            romanNumerals.put(1, "I");
            romanNumerals.put(4, "IV");
            romanNumerals.put(5, "V");
            romanNumerals.put(9, "IX");
            romanNumerals.put(10, "X");
            romanNumerals.put(40, "XL");
            romanNumerals.put(50, "L");
            romanNumerals.put(90, "XC");
            romanNumerals.put(100, "C");
            romanNumerals.put(400, "CD");
            romanNumerals.put(500, "D");
            romanNumerals.put(900, "CM");
            romanNumerals.put(1000, "M");

            int romanFloor =  romanNumerals.floorKey(n); // floorkey returns the closest lower value possible to get than n
            if ( n == romanFloor ) {
                return romanNumerals.get(n);
            }
            return romanNumerals.get(romanFloor) + solution(n-romanFloor); // recursion
        }

        return "";

    }
}

// that was so hard