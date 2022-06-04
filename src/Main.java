import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        Scanner scanner = new Scanner(System.in);

        File file = new File("UP.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start(); // runs as a background thread. so the script will be terminated, once the code is done

        String response = "";

        while(!response.equals("Q")){
            System.out.println("R - Restart, P - Play, S - Stop, Q - Quit");
            response = scanner.next().toUpperCase(Locale.ROOT);
            switch(response){
                case("R") -> clip.setMicrosecondPosition(0);
                case("P") -> clip.start();
                case("S") -> clip.stop();
                case("Q") -> System.out.println("Bye :)");
                default -> System.out.println("Not a valid response");
            }
        }

    }
}