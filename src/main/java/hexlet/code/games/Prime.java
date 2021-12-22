package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;

public class Prime {

    private static final String RULES_PRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void thePrime() {
        String[][] questionsToAnswers = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            int number = Utils.randomNumber(Utils.UPPER_RANDOM_LIMIT, Utils.LOWER_RANDOM_LIMIT);

            questionsToAnswers[i][0] = String.valueOf(number);
            questionsToAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.theGame(questionsToAnswers, RULES_PRIME);
    }

    private static boolean isPrime(int number) {
        for (int j = 2; j < number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
