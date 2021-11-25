package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    private Scanner scanner = new Scanner(System.in);

    //  массив действий с геттером
    private char[] mathActionArray = {'*', '+', '-'};
    public char[] getMathActionArray() {return mathActionArray;}

    //  рандом цифр
    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(99 - 1) + 1;
    }

    //  рандом выбора действия
    private int getRandomMathematicalAction() {
        Random random = new Random();
        return random.nextInt(getMathActionArray()[getMathActionArray().length - 1] - getMathActionArray()[0]);
    }

    public void calculatorTheGame() {

        System.out.println("What is the result of the expression?");
        scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int trueResult = 0;
            int firstNumber = getRandomNumber();
            char mathAction = getMathActionArray()[getRandomMathematicalAction()];
            int secondNumber = getRandomNumber();
            String mathExpression = firstNumber + " " + mathAction + " " + secondNumber;

            switch (mathAction) {
                case '*':
                    trueResult = firstNumber * secondNumber;
                    break;
                case '+':
                    trueResult = firstNumber + secondNumber;
                    break;
                case '-':
                    trueResult = firstNumber - secondNumber;
                    break;
                default:
                    System.out.println("PROBLEM");
            }

            System.out.println("Question: " + mathExpression);
            System.out.print("Your answer: ");
            int myResult = scanner.nextInt();

            if (myResult == trueResult) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + myResult + "' is wrong answer ;(. Correct answer was '" + trueResult + "'.");
                System.out.println("\nLet's try again, " + Cli.name + "!");
                System.exit(0);
            }
        }
        System.out.println("\nCongratulations, " + Cli.name +"!");
    }
}
