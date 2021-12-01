package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public final class GDC extends Games {

    //  рандом цифр
    private int getRandomNumber() {
        final int upperRandomLimit = 100;
        Random random = new Random();
        return random.nextInt(upperRandomLimit - 1) + 1;
    }

    @Override
    public void playTheGame() {
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < Games.CYCLES; i++) {
            int firstNumber = getRandomNumber();
            int secondNumber = getRandomNumber();
            int trueResult = 1;
            int min = Math.min(firstNumber, secondNumber);

            for (int j = min; j > 0; j--) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    trueResult = j;
                    break;
                }
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
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
