package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    private Scanner scanner;
    private int[] progression;

    public Progression() {
        progressionTheGame();
    }

    private void lengthRandom() {
        Random random = new Random();
        int result = random.nextInt(10 - 5) + 5;
        progression = new int[result];
    }

    private int elementForQuestion() {
        Random random = new Random();
        return random.nextInt(progression.length - 1);
    }

    private int progressionShiftRandom() {
        Random random = new Random();
        return random.nextInt(6 - 2) + 2;
    }

    private int startPositionRandom() {
        Random random = new Random();
        return random.nextInt(14 - 2) + 2;
    }

    private void progressionTheGame() {
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < 3; i++) {

            lengthRandom();
            int startProgression = startPositionRandom();
            int shiftProgression = progressionShiftRandom();
            for (int j = 0, k = startProgression; j < progression.length; j++, k += shiftProgression) {
                progression[j] = k;
            }
            int numberForQuestion = elementForQuestion();
            int trueResult = progression[numberForQuestion];

            scanner = new Scanner(System.in);
            System.out.print("Question: ");
            for (int j = 0; j < progression.length; j++) {
                if (j != numberForQuestion) {
                    System.out.print(progression[j] + " ");
                } else {
                    System.out.print(".. ");
                }
            }
            System.out.print("Your answer: ");
            int myResult = scanner.nextInt();

            if (myResult == trueResult) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + trueResult + "'.");
                System.out.println("\nLet's try again, " + Cli.name + "!");
                System.exit(0);
            }
        }
        System.out.println("\nCongratulations, " + Cli.name +"!");
    }
}
