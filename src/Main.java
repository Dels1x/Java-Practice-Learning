public class Main {

    public static void main(String[] args) throws InterruptedException {

        Runnable hi = () -> {
            for(int i = 5; i > 0; i--) {
                System.out.println("Hello from Miami, dude! "+Thread.currentThread().getPriority());
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };
        Runnable bye = () -> {
            for(int i = 5; i > 0; i--) {
                System.out.println("Hi man! We are niggas with attitudes! Straight outta compton!");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };

        Runnable forever = () -> {
            int s = 0;
            while(true) {
                System.out.println("Seconds"+s);
                s++;
                try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };

        Thread thread1 = new Thread(hi);
        Thread thread2 = new Thread(bye);
        Thread thread3 = new Thread(forever);

        thread1.start();
        try {Thread.sleep(250);} catch (InterruptedException e) {throw new RuntimeException(e);}
        thread2.start();
        thread3.setDaemon(true);
        thread3.start();

        System.out.println("The main thread is still going :D");


        thread1.setName("Hello from miami");
        thread2.setName("Straight outta Compton");

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());

        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);


        if(thread2.isAlive()) thread2.join(); // main thread joins thread2 and waits until thread2 is completed

        System.out.println("All threads except main ended it job!");

    }
}