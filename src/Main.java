import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Kata.find(new int[] {2, -6, 8, -10, -3,}));
        System.out.println(-9 % 2);

    }
}

class Kata {
    static int find(int[] integers) {
        long evenNum =  Arrays.stream(integers).filter(i -> i % 2 == 0).count();
        System.out.println(evenNum);
        return evenNum == 1 ?
                Arrays.stream(integers).filter(i -> i % 2 == 0).findFirst().orElse(0):
                Arrays.stream(integers).filter(i -> i % 2 == 1 || i % 2 == -1).findFirst().orElse(0);
    }
}