package projects;

public class MathGame {
    public static void main(String[] args) {

        int correctGuesses = 0;
        int falseGuesses = 0;

        while(true) {
            NumberGenerator exercise = new NumberGenerator();
            int result = exercise.showExercise();

            if(result == 1){
                correctGuesses++;
            }
            else{
                falseGuesses++;
            }


            System.out.printf("W%d:L%d\n\n\n", correctGuesses, falseGuesses);
        }

    }
}
