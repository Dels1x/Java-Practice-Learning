import java.math.*;
import java.sql.Time;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.time.*;


public class Main {

    public static void main(String[] args) {


        Thread myThread = new MyThread();
        myThread.run();

        for(int i = 50; i >= 0; i--) {
            System.out.println(i);
        }
    }



}