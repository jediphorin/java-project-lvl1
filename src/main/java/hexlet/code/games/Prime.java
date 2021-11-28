package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    private Scanner scanner;

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100 - 1) + 1;
    }

    public void primeTheGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int number = getRandomNumber();
            String trueResult = "yes";
            for (int j = 2; j < number / 2; j++) {
                if (number % j == 0) {
                    trueResult = "no";
                }
            }

            scanner = new Scanner(System.in);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String myResult = scanner.nextLine();

            if (myResult.equals(trueResult)) {
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
