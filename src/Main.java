import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] tictactoe = new int[3][3];

        int index = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                index++;
                tictactoe[i][j] = index;
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(tictactoe[i][j] + " ");
            }
            System.out.println();
        }


    }
}
