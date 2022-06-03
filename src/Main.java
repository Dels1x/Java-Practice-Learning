import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\38099\\IdeaProjects\\BroCode\\src\\secret_message.txt");

        if(file.exists()) {
            System.out.println("That file exists 0_0");
            System.out.println(file);
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist x_x");
        }

        // ?

    }


}
