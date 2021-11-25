package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static Scanner scanner = new Scanner(System.in);

    public static void evenNumber() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int number = random.nextInt();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String yourAnswer = scanner.nextLine();

            String trueAnswer;
            if (number % 2 == 0) {
                trueAnswer = "yes";
            } else {
                trueAnswer = "no";
            }

            if (yourAnswer.equals(trueAnswer)) {
                System.out.println("Correct!");
            } else {
                i = -1;
                System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'");
                System.out.println("Let's try again, " + Cli.name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.name +"!");
    }
}
