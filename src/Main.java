public class Main {

    public static void main(String[] args) throws InterruptedException {

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

        System.out.println("The main thread is still going :D");

        if(thread2.isAlive()) thread2.join(); // main thread joins thread2 and waits until thread2 is completed

        System.out.println("All threads except main ended it job!");

    }
}