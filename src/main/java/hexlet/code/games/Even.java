package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public final class Even {

    public static void playTheEven() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Games.CYCLES; i++) {
            Random random = new Random();
            int number = random.nextInt();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String yourAnswer = scanner.nextLine();

            if (!yourAnswer.equals("yes") && !yourAnswer.equals("no")) {
                System.out.println("'" + yourAnswer + "' is wrong answer ;(");
                System.exit(0);
            }

            String trueAnswer;
            if (number % 2 == 0) {
                trueAnswer = "yes";
            } else {
                trueAnswer = "no";
            }

            if (yourAnswer.equals(trueAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'");
                Games.fail();
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
