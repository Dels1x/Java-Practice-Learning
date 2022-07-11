import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(M2048.merge(new int[] {8, 8, 2, 4})));

    }


}


class M2048 {

    static int[] merge(int[] line) {
        int temp;
        line = moveZerosToEnd(line);
        for(int i = 0; i < line.length-1; i++) {
            temp = line[i];
            if(line[i+1] == temp) {
                line[i] = temp*2;
                line[i+1] = 0;
            }
        }
        return moveZerosToEnd(line);
    }

    static int[] moveZerosToEnd(int[] line) {
        int count = 0;

        for(int i = 0; i < line.length; i++) {
            if(line[i] != 0) {
                line[count++] = line[i];
            }
        }

        while(count < line.length) {
            line[count++] = 0;
        }

        return line;
    }
}

