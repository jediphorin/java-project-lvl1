package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    //  рандом цифр
    private static int getRandomNumber() {
        Random random = new Random();
        final int upperRandomLimit = 99;
        return random.nextInt(upperRandomLimit - 1) + 1;
    }

    public static void theCalc() {
        final String rulesCalc = "What is the result of the expression?";
        final char[] mathActionArray = {'*', '+', '-'};
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {

            Random random = new Random();
            int mathActionElement = random.nextInt(mathActionArray[mathActionArray.length - 1] - mathActionArray[0]);
            char mathAction = mathActionArray[mathActionElement];

            int firstNumber = getRandomNumber();
            int secondNumber = getRandomNumber();
            String mathExpression = firstNumber + " " + mathAction + " " + secondNumber;
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
            result[i][0] = mathExpression;
            result[i][1] = String.valueOf(trueResult);
        }
        Engine.theGame(result, rulesCalc);
    }
}
