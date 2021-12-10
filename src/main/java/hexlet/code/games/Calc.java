package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void theCalc() {
        final String rulesCalc = "What is the result of the expression?";
        final char[] mathActionArray = {'*', '+', '-'};
        String[][] result = Engine.createTheArrayForQuestionsAndTrueAnswers();

        for (int i = 0; i < Engine.CYCLES; i++) {

            final int upperMathActionLimit = mathActionArray.length - 1;
            final int lowerMathActionLimit = 0;
            int mathActionElement = Engine.randomNumber(upperMathActionLimit, lowerMathActionLimit);
            char mathAction = mathActionArray[mathActionElement];

            final int upperRandomLimit = 99;
            final int lowerRandomLimit = 1;
            int firstNumber = Engine.randomNumber(upperRandomLimit, lowerRandomLimit);
            int secondNumber = Engine.randomNumber(upperRandomLimit, lowerRandomLimit);

            result[i][0] = firstNumber + " " + mathAction + " " + secondNumber;

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
            result[i][1] = String.valueOf(trueResult);
        }
        Engine.theGame(result, rulesCalc);
    }
}
