import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
            stack = a LIFO data structure. Last-in First-out
            stores objects into a sort of "vertical tower"
            push() to add to the top
            pop() to remove from the top
        */

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty()); // returns true or false whether if the stack is empty

        stack.push("Minecraft");
        stack.push("The Neverhood");
        stack.push("Mafia: the City of Lost Heaven");
        stack.push("Detroit: Become Human");
        stack.push("The Witcher");
        stack.push("The Witcher II");

        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();

        String myFavGame = stack.pop();

        System.out.println(myFavGame);

        System.out.println(stack.search("The Witcher")); // return -1 because The Witcher is not anymore in the stack since we popped it
        System.out.println(stack.search("Minecraft")); // return index from top

        /*  uses of stacks?
            1. undo/redo features in text editors
            2. moving back/forward through the browser history
            3. backtracking algorithms (maze, file directories)
            4. calling functions (call stack)
        */
    }
}