package hexlet.code;

import hexlet.code.games.Progression;

import hexlet.code.games.GDC;

import hexlet.code.games.Prime;

import hexlet.code.games.Even;

import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    private static final int CALC_NUMBER = 3;
    private static final int GDC_NUMBER = 4;
    private static final int PROGRESSION_NUMBER = 5;
    private static final int PRIME_NUMBER = 6;

    public static void main(String[] args) {

        System.out.print("Please enter the game number and press Enter.");
        System.out.println("\n1 - Greet\n2 - Even\n3 - Calc\n4 - GDC\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        if (gameNumber != 0) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.nameSetting();

            switch (gameNumber) {
                case 2 -> Even.theEven();
                case CALC_NUMBER -> Calc.theCalc();
                case GDC_NUMBER -> GDC.theGDC();
                case PROGRESSION_NUMBER -> Progression.theProgression();
                case PRIME_NUMBER -> Prime.thePrime();
                default -> {
                }
            }
        }
    }
}
