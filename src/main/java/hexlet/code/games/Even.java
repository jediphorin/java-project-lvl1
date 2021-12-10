package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void theEven() {
        final String rulesEven = "Answer 'yes' if number even otherwise answer 'no'.";
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {
            int number = Engine.randomNumber();
            result[i][0] = String.valueOf(number);

            if (number % 2 == 0) {
                result[i][1] = "yes";
            } else {
                result[i][1] = "no";
            }
        }
        Engine.theGame(result, rulesEven);
    }
}
