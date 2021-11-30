package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Prime extends Games {

    private int getRandomNumber() {
        Random random = new Random();
        int upperRandomlimit = 100;
        return random.nextInt(upperRandomlimit - 1) + 1;
    }

    @Override
    public void playTheGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < Games.CYCLES; i++) {
            int number = getRandomNumber();
            String trueResult = "yes";
            for (int j = 2; j < number / 2; j++) {
                if (number % j == 0) {
                    trueResult = "no";
                }
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String myResult = scanner.nextLine();

            if (myResult.equals(trueResult)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + trueResult + "'.");
                Games.fail();
            }
        }
        System.out.println("\nCongratulations, " + Cli.getName() + "!");
    }
}
