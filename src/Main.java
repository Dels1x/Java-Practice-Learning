public class Main {
    public static void main(String [] args) {

        String str = "s1mple G.O.A.T.";
        char lol = '1';

        MyInteface myInterface = (x, y) -> System.out.println(x);
        myInterface.message(str, lol);
    }

    public static int solution(int number) {
        return number * 2;

    }

}