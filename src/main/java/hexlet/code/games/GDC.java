package hexlet.code.games;

import hexlet.code.Engine;

public class GDC {

    public static void theGDC() {
        final String rulesGdc = "Find the greatest common divisor of given numbers.";
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            final int upperRandomLimit = 100;
            final int lowerRandomLimit = 1;
            int firstNumber = Engine.randomNumber(upperRandomLimit, lowerRandomLimit);
            int secondNumber = Engine.randomNumber(upperRandomLimit, lowerRandomLimit);

            result[i][0] = firstNumber + " " + secondNumber;
            int trueResult;
            int min = Math.min(firstNumber, secondNumber);

            for (int j = min; j > 0; j--) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    trueResult = j;
                    result[i][1] = String.valueOf(trueResult);
                    break;
                }
            }
        }
        Engine.theGame(result, rulesGdc);
    }
}
