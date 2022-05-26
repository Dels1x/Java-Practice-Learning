import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            String = a reference data type that can store on or more characters
                     reference data types have access to useful methods
         */

        String name = "delsix";
        String name2 = "";

        boolean result1 = name.equals("Delsix");
        boolean result2 = name.equalsIgnoreCase("Delsix"); // ignores upper/lowercase
        int result3 = name.length();
        char result4 = name.charAt(name.length()-1);
        int result5 = name.indexOf(result4);
        boolean result6 = name2.isEmpty();
        String result7 = name.replace("i", "e").replace("d", "s");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);

    }
}
