import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"NORTH", "NORTH", "SOUTH", "SOUTH", "WEST", "NORTH", "EAST"})));

    }
}

class Kata {
    public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = !stack.isEmpty() ? stack.lastElement() : null;

            switch (direction) {
                case "NORTH" -> {if("SOUTH".equals(lastElement)){stack.pop();} else {stack.push(direction);}}
                case "SOUTH" -> {if("NORTH".equals(lastElement)){stack.pop();} else {stack.push(direction);}}
                case "EAST" -> {if("WEST".equals(lastElement)){stack.pop();} else {stack.push(direction);}}
                case "WEST" -> {if("EAST".equals(lastElement)){stack.pop();} else {stack.push(direction);}}
            }
        }

        return stack.toArray(String[]::new);
    }
}