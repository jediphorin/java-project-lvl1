package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void thePrime() {
        final String rulesPrime = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {

            final int upperRandomLimit = 100;
            final int lowerRandomLimit = 1;
            int number = Engine.randomNumber(upperRandomLimit, lowerRandomLimit);

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
