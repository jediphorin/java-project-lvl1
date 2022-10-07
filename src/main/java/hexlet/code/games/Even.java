package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;

public class Even {

    private static final String RULES_EVEN = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void theEven() {

        String[][] questionsToAnswers = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            int number = Utils.randomNumber();
            questionsToAnswers[i][0] = String.valueOf(number);
            questionsToAnswers[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.theGame(questionsToAnswers, RULES_EVEN);
    }
}
