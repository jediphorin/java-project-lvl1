package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;

public class Calc {

    private static final String RULES_CALC = "What is the result of the expression?";
    private static final char[] MATH_ACTION_ARRAY = {'*', '+', '-'};
    private static final int UPPER_MATH_ACTION_LIMIT = MATH_ACTION_ARRAY.length - 1;
    private static final int LOWER_MATH_ACTION_LIMIT = 0;

    public static void theCalc() {
        String[][] questionsToAnswers = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {

            int mathActionElement = Utils.randomNumber(UPPER_MATH_ACTION_LIMIT, LOWER_MATH_ACTION_LIMIT);
            char mathAction = MATH_ACTION_ARRAY[mathActionElement];

            int firstNumber = Utils.randomNumber(Utils.UPPER_RANDOM_LIMIT, Utils.LOWER_RANDOM_LIMIT);
            int secondNumber = Utils.randomNumber(Utils.UPPER_RANDOM_LIMIT, Utils.LOWER_RANDOM_LIMIT);

            questionsToAnswers[i][0] = firstNumber + " " + mathAction + " " + secondNumber;

            int trueResult = calculateTrueAnswer(mathAction, firstNumber, secondNumber);
            questionsToAnswers[i][1] = String.valueOf(trueResult);
        }
        Engine.theGame(questionsToAnswers, RULES_CALC);
    }

    private static int calculateTrueAnswer(char mathAction, int firstNumber, int secondNumber) {
        int trueResult = 0;
        switch (mathAction) {
            case '*' -> {
                trueResult = firstNumber * secondNumber;
            }
            case '+' -> {
                trueResult = firstNumber + secondNumber;
            }
            case '-' -> {
                trueResult = firstNumber - secondNumber;
            }
            default -> System.out.println("PROBLEM");
        }
        return trueResult;
    }
}
