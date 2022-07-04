class FatherClass {
    String hello = "Hello from Miami, dude!";
    String hi = "Hi man! We are niggas with attitudes! Straight out of compton!";
}

class Hi extends FatherClass implements Runnable {
    public void run() {
        for(int i = 5; i > 0; i--) {
            System.out.println(hi);
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

class Bye extends FatherClass implements Runnable {
    public void run() {
        for(int i = 5; i > 0; i--) {
            System.out.println(hello);
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Runnable hi = new Hi();
        Runnable bye = new Bye();

        Thread thread1 = new Thread(hi);
        Thread thread2 = new Thread(bye);

        thread1.start();
        try {Thread.sleep(250);} catch (InterruptedException e) {throw new RuntimeException(e);}
        thread2.start();

    }
}