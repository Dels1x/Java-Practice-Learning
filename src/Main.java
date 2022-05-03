import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Random random = new Random();

        int x = random.nextInt(1, 10);
        double y = random.nextDouble(1, 10);
        boolean z = random.nextBoolean();

        System.out.println(x + y);
        System.out.println(z);

    }
}
