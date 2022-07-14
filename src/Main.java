public class Main {
    public static void main(String[] args) {


        System.out.println(Kata.ascendDescend(25, -9, -3));

    }
}

class Kata {

    public static String ascendDescend(int length, int minimum, int maximum) {
        if (minimum > maximum || length == 0) return "";
        String output = "";
        int num = minimum;
        boolean ascending = true;

        while (output.length() < length) {
            if (num == maximum) ascending = false;
            else if (num == minimum) ascending = true;

            if (ascending)
                output = output.concat(String.valueOf(num++));
            else if (minimum != maximum)
                output = output.concat(String.valueOf(num--));
            else {
                output = output.concat(String.valueOf(num));
            }

            System.out.println(output);
            System.out.println(output.length());
        }
        return output.substring(0, length);
    }
}