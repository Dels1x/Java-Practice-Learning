class Hi extends Thread {
    public void run() {
        for(int i = 5; i > 0; i--) {
            System.out.println("Hi");
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

class Bye extends Thread {
    public void run() {
        for(int i = 5; i > 0; i--) {
            System.out.println("Bye");
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Hi hi = new Hi();
        Bye bye = new Bye();

        hi.start();
        try {Thread.sleep(250);} catch (InterruptedException e) {throw new RuntimeException(e);}
        bye.start();

    }
}