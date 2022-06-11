import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        // static = modifier. all objects of a class share static variables/methods. if static var change in 1 objects
        //          it changes in others too

        friends friend = new friends();
        friends frie = new friends();
        System.out.println(friend.i);
        friend.add(50);
        System.out.println(frie.i);

    }
}

