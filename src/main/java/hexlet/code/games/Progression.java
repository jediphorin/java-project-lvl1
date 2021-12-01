package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public final class Progression extends Games {

    private int[] progression;

    private void lengthRandom() {
        final int upperLengthLimit = 10;
        final int lowerLengthLimit = 5;
        Random random = new Random();
        int result = random.nextInt(upperLengthLimit - lowerLengthLimit) + lowerLengthLimit;
        progression = new int[result];
    }

    private int elementForQuestion() {
        Random random = new Random();
        return random.nextInt(progression.length - 1);
    }

    private int progressionShiftRandom() {
        final int upperProgressionShiftRandomLimit = 6;
        Random random = new Random();
        return random.nextInt(upperProgressionShiftRandomLimit - 2) + 2;
    }

    private int startPositionRandom() {
        final int upperStartPositionRandomLimit = 14;
        Random random = new Random();
        return random.nextInt(upperStartPositionRandomLimit - 2) + 2;
    }

    @Override
    public void playTheGame() {
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < Games.CYCLES; i++) {

            lengthRandom();
            int startProgression = startPositionRandom();
            int shiftProgression = progressionShiftRandom();
            for (int j = 0, k = startProgression; j < progression.length; j++, k += shiftProgression) {
                progression[j] = k;
            }
            int numberForQuestion = elementForQuestion();
            int trueResult = progression[numberForQuestion];

            Scanner scanner = new Scanner(System.in);
            System.out.print("Question: ");
            for (int j = 0; j < progression.length; j++) {
                if (j != numberForQuestion) {
                    System.out.print(progression[j] + " ");
                } else {
                    System.out.print(".. ");
                }
            }
            System.out.print("\nYour answer: ");
            int myResult = scanner.nextInt();

            if (myResult == trueResult) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + trueResult + "'.");
                Games.fail();
            }
        }
        System.out.println("\nCongratulations, " + Cli.getName() + "!");
    }
}
