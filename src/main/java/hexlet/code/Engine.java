package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int CYCLES = 3;

    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String paramName) {
        Engine.name = paramName;
    }

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
                    break;
//                    System.exit(0);
                }
            }

            if (myResult.equals(qna[i][1])) {
                System.out.println("Correct!");
                if (i == CYCLES - 1) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                String correctAnswer = qna[i][1];

                System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
    }

    public static String[][] createTheArrayForQuestionsAndTrueAnswers() {
        final int questions = 3;
        final int answers = 2;
        return new String[questions][answers];
    }
}
