import java.util.HashMap;

public class Main {
    public static void main(String [] args) {

        // HashMap implemetns the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use WrapperClass
        // ex: (name, email), (username, userID), (country, capital)

        HashMap<String, Integer> RomanNumerals = new HashMap<>();

        // add key and value

        RomanNumerals.put("I", 1);
        RomanNumerals.put("V", 5);
        RomanNumerals.put("X", 10);
        RomanNumerals.put("L", 50);
        RomanNumerals.put("C", 100);
        RomanNumerals.put("D", 500);
        RomanNumerals.put("M", 1000);
        RomanNumerals.put("DICK", 1337);

        System.out.println(RomanNumerals);

        RomanNumerals.remove("DICK"); // remove from dict
        System.out.println(RomanNumerals.get("I") + RomanNumerals.get("V"));
        System.out.println(RomanNumerals.size()); // get size of dict
        System.out.println(RomanNumerals.containsKey("DICK")); // return true/false based if there is DICK key or not

        // RomanNumerals.clear(); // delete every item from dict

        for (String i : RomanNumerals.keySet()) {
            System.out.print(i + "\t = ");
            System.out.println(RomanNumerals.get(i));
        }

    }
}
