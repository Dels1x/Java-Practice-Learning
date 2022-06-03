import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // FileReader = read the content of a file as a stream of characters. return int byte value

        try {
            FileReader fr = new FileReader("poem.txt");
            int data = fr.read();
            while(data != -1) {
                System.out.print((char)data);
                data = fr.read();
            }
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }


}
