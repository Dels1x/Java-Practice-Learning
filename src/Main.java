import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String day = "Friday";

        switch(day) {
            case "Sunday": System.out.println("This is sunday!");
            break;
            case "Monday": System.out.println("HLTV top 20 today in 20:00!");
            break;
            case "Friday": System.out.println("Weekend tomorrow!");
            break;
            case "Tuesday": System.out.println("This is tuesday!");
            break;
            case "Wednesday": System.out.println("This is wednesday!");
            break;
            case "Saturday": System.out.println("This is saturday!");
            break;
            case "Thursday": System.out.println("This is thursday!");
            break;
            default: System.out.println("This is not a day!");
        }


    }
}
