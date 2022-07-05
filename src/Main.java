public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(BouncingBall.bouncingBall(3.0, 0.66, 1.5));

    }


}

class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        if(h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1;

        int count = -1;

        while(h > window) {
            count+=2;
            h *= bounce;
        }

        return count;

    }
}
