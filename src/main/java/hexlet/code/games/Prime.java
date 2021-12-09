package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static int getRandomNumber() {
        final int upperRandomLimit = 100;
        Random random = new Random();
        return random.nextInt(upperRandomLimit - 1) + 1;
    }

    public static void thePrime() {
        final String rulesPrime = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            int number = getRandomNumber();
            result[i][0] = String.valueOf(number);
            String trueResult = "yes";
            for (int j = 2; j < number / 2; j++) {
                if (number % j == 0) {
                    trueResult = "no";
                    break;
                }
            }
            result[i][1] = trueResult;
        }
        Engine.theGame(result, rulesPrime);
    }
}
