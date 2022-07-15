public class Main {
    public static void main(String[] args) {

        System.out.println(Kata.countBits(1234));

    }
}

class Kata {
    public static int countBits(int n){
        String binaryNum = Integer.toBinaryString(n);
        int output = 0;

        for(int i = 0; i < binaryNum.length(); i++) {
            output += Character.getNumericValue(binaryNum.charAt(i));
        }

        return output;
    }
}