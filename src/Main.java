public class Main {
    public static void main(String[] args) {

        int n = 3456789;
        int p = 1;
        int result = 2360688;
        double k = (double) result / n;

        System.out.println(DigPow.digPow(n, p));

    }
}

class DigPow {
    public static long digPow(int n, int p) {
        char[] digits = String.valueOf(n).toCharArray();
        int result = 0;

        for(int i = 0; i < digits.length; i++) {
            result += Math.pow(Character.getNumericValue(digits[i]), (p+i));
        }

        double k = (double) result / n;

        return result == n*k && (k % 1) == 0? (int) k : -1;
    }
}
