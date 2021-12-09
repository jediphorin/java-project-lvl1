package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GDC {

    //  рандом цифр
    private static int getRandomNumber() {
        final int upperRandomLimit = 100;
        Random random = new Random();
        return random.nextInt(upperRandomLimit - 1) + 1;
    }

    public static void theGDC() {
        final String rulesGdc = "Find the greatest common divisor of given numbers.";
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            int firstNumber = getRandomNumber();
            int secondNumber = getRandomNumber();
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
