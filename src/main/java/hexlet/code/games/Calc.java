package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public final class Calc extends Games {

    //  массив действий с геттером
    private final char[] mathActionArray = {'*', '+', '-'};

    private char[] getMathActionArray() {
        return mathActionArray;
    }

    //  рандом цифр
    private int getRandomNumber() {
        Random random = new Random();
        final int upperRandomLimit = 99;
        return random.nextInt(upperRandomLimit - 1) + 1;
    }

    //  рандом выбора действия
    private int getRandomMathematicalAction() {
        Random random = new Random();
        return random.nextInt(getMathActionArray()[getMathActionArray().length - 1] - getMathActionArray()[0]);
    }

    @Override
    public void playTheGame() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Games.CYCLES; i++) {

            int firstNumber = getRandomNumber();
            char mathAction = getMathActionArray()[getRandomMathematicalAction()];
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
                default -> {
                    System.out.println("PROBLEM");
                }
            }

            System.out.println("Question: " + mathExpression);
            System.out.print("Your answer: ");
            int myResult = scanner.nextInt();

            if (myResult == trueResult) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + trueResult + "'.");
                Games.fail();
            }
        }
        System.out.println("\nCongratulations, " + Cli.getName() + "!");
    }
}
