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

            calculatingTheAnswer(firstNumber, secondNumber, result, i);
            /*int min = Math.min(firstNumber, secondNumber);
            int trueResult;
            for (int j = min; j > 0; j--) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    trueResult = j;
                    result[i][1] = String.valueOf(trueResult);
                    break;
                }
            }*/
        }
        Engine.theGame(result, rulesGdc);
    }

    private static void calculatingTheAnswer(int firstNumber, int secondNumber, String[][] result, int i) {
        int trueResult;
        for (int min = Math.min(firstNumber, secondNumber); min > 0; min--) {
            if (firstNumber % min == 0 && secondNumber % min == 0) {
                trueResult = min;
                result[i][1] = String.valueOf(trueResult);
                break;
            }
        }
    }

    //  !УДАЛИТЬ!
    private static int numbersRandom() {
        final int upperRandomLimit = 100;
        final int lowerRandomLimit = 1;
        return Engine.randomNumber(upperRandomLimit, lowerRandomLimit);
    }
}
