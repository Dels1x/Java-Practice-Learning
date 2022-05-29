package projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
    Random random = new Random(); // creating an object of class Random, so we can use its methods
    Scanner scanner = new Scanner(System.in);

    int difficulty; // creating set of difficulty, so we can have tasks of different difficulty
    char[] operators =  {'+', '-'};
    int number1; // creating numbers that we will use in our expressions
    int number2;
    int number3 = 0;
    char operator1;
    char operator2;


    NumberGenerator(){
        this.difficulty = random.nextInt(3)+1; // randomizing numbers
        if(this.difficulty == 1){
            this.number1 = random.nextInt(9)+2;
            this.number2 = random.nextInt(9)+2;
            this.operator1 = operators[random.nextInt(operators.length)];
        }
        if(this.difficulty == 2){
            this.number1 = random.nextInt(49)+2;
            this.number2 = random.nextInt(49)+2;
            this.operator1 = operators[random.nextInt(operators.length)];
        }
        if(this.difficulty == 3){
            this.number1 = random.nextInt(49)+2;
            this.number2 = random.nextInt(49)+2;
            this.number3 = random.nextInt(49)+2;
            this.operator1 = operators[random.nextInt(operators.length)];
            this.operator2 = operators[random.nextInt(operators.length)];
        }
    }

    int showExercise(){
        int result = 0;

        if(this.number3 == 0) { // checking if number3 exists or not, so we can make proper exercises
            System.out.printf("Your exercise is: %d %c %d = ?\n", number1, operator1, number2);
            switch(operator1) {
                case '+' -> result = number1 + number2;
                case '-' -> result = number1 - number2;
            }
        }
        else{
            System.out.printf("Your exercise is: %d %c %d %c %d = ?\n", number1, operator1, number2, operator2, number3);
            if(operator1 == '+' && operator2 == '+'){
                result = number1 + number2 + number3;
            }
            else if(operator1 == '+' && operator2 == '-'){
                result = number1 + number2 - number3;
            }
            else if(operator1 == '-' && operator2 == '+'){
                result = number1 - number2 + number3;
            }
            else{
                result = number1 - number2 - number3;
            }
        }

        int guess = scanner.nextInt();

        if(guess == result){
            System.out.println("CORRECT!");
            return 1;
        }
        else{
            System.out.printf("WRONG! Answer was: %d\n", result);
            return 0;
        }

    }
}
