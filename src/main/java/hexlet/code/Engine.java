package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int CYCLES = 3;

    public static void theGame(String[][] qna, String rules) {
        System.out.println(rules);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < CYCLES; i++) {
            String myResult = typingMyAnswer(qna, i, scanner);
//            System.out.println("Question: " + qna[i][0]);
//            System.out.print("Your answer: ");
//            String myResult = scanner.nextLine();

            incorrectStringChecking(qna, i, myResult);
            /*if ((qna[i][1].equals("yes") || qna[i][1].equals("no"))) {
                if (!myResult.equals("yes") && !myResult.equals("no")) {
                    System.out.println("'" + myResult + "' is wrong answer ;(");
                    System.exit(0);
                }
            }*/

            if (myResult.equals(qna[i][1])) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = qna[i][1];
                fail(myResult, correctAnswer);
//                System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + qna[i][1] + "'");
//                System.out.println("Let's try again, " + Cli.getName() + "!");
//                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    private static String typingMyAnswer(String[][] qna, int i, Scanner scanner) {
        System.out.println("Question: " + qna[i][0]);
        System.out.print("Your answer: ");
        return scanner.nextLine();
    }

    private static void incorrectStringChecking(String[][] qna, int i, String myResult) {
        if ((qna[i][1].equals("yes") || qna[i][1].equals("no"))) {
            if (!myResult.equals("yes") && !myResult.equals("no")) {
                System.out.println("'" + myResult + "' is wrong answer ;(");
                System.exit(0);
            }
        }
    }

    private static void fail(String myResult, String correctAnswer) {
        System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.getName() + "!");
        System.exit(0);
    }

    public static String[][] createTheArrayForQuestionsAndTrueAnswers() {
        final int questions = 3;
        final int answers = 2;
        return new String[questions][answers];
    }

    public static int randomNumber(int upper, int lower) {
        Random random = new Random();
        return random.nextInt(upper - lower) + lower;
    }
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
    public static int randomNumber(int elements) {
        Random random = new Random();
        return random.nextInt(elements);
    }
}
