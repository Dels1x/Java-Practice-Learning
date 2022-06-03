import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("poem.txt");
            fw.write("check heaven check heaven cover me");
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }


}
