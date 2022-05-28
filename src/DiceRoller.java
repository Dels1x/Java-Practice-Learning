import java.util.Random;

public class DiceRoller {
    Random random; // declaring 2 variables in the global scope
    int number;

    DiceRoller(){
        random = new Random(); // we could define them here, but it would be local then
        roll(); // and we would write them in parentheses as arguments
    }

    void roll(){
        number = random.nextInt(6)+1; // random.nextInt return numbers 0-5 (cuz we wrote 6 as max), +1 for it to be 1-6.
        System.out.println(number); // writing the result into console
    }
}
