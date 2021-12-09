package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int CYCLES = 3;

    public static void theGame(String[][] qna, String rules) {
        System.out.println(rules);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < CYCLES; i++) {
            System.out.println("Question: " + qna[i][0]);
            System.out.print("Your answer: ");
            String myResult = scanner.nextLine();

            if ((qna[i][1].equals("yes") || qna[i][1].equals("no"))) {
                if (!myResult.equals("yes") && !myResult.equals("no")) {
                    System.out.println("'" + myResult + "' is wrong answer ;(");
                    System.exit(0);
                }
            }

            if (myResult.equals(qna[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + qna[i][1] + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static String[][] createTheArrayForQuestionsAndTrueAnswers() {
        final int questions = 3;
        final int answers = 2;
        return new String[questions][answers];
    }
}
