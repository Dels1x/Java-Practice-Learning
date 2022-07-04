public class Main {

    public static void main(String[] args) {

        Runnable hi = () -> {
            for(int i = 5; i > 0; i--) {
                System.out.println("Hello from Miami, dude!");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };
        Runnable bye = () -> {
            for(int i = 5; i > 0; i--) {
                System.out.println("Hi man! We are niggas with attitudes! Straight out of compton!");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };

        Thread thread1 = new Thread(hi);
        Thread thread2 = new Thread(bye);

        thread1.start();
        try {Thread.sleep(250);} catch (InterruptedException e) {throw new RuntimeException(e);}
        thread2.start();

    }
}