package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;

public class GDC {

    private static final String RULES_GDC = "Find the greatest common divisor of given numbers.";

    public static void theGDC() {
        String[][] questionsToAnswers = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            int firstNumber = Utils.randomNumber(Utils.UPPER_RANDOM_LIMIT, Utils.LOWER_RANDOM_LIMIT);
            int secondNumber = Utils.randomNumber(Utils.UPPER_RANDOM_LIMIT, Utils.LOWER_RANDOM_LIMIT);
            questionsToAnswers[i][0] = firstNumber + " " + secondNumber;
            int theGDC = findGDC(firstNumber, secondNumber);
            questionsToAnswers[i][1] = String.valueOf(theGDC);
        }
        Engine.theGame(questionsToAnswers, RULES_GDC);
    }

    private static int findGDC(int firstNumber, int secondNumber) {
        int trueResult = 1;
        for (int min = Math.min(firstNumber, secondNumber); min > 0; min--) {
            if (firstNumber % min == 0 && secondNumber % min == 0) {
                trueResult = min;
                break;
            }
        }
        return trueResult;
    }
}
