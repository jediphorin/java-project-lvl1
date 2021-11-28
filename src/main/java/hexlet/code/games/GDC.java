package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GDC {

    private Scanner scanner;

    //  рандом цифр
    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100 - 1) + 1;
    }

    public void GDCTheGame() {

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {
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

            scanner = new Scanner(System.in);
            System.out.println("Question: " + firstNumber + " " + secondNumber);
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
