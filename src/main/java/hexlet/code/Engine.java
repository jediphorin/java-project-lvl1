package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GDC;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {

    public static void executeTheGame() {

        System.out.print("Please enter the game number and press Enter.");
        System.out.println("\n1 - Greet\n2 - Even\n3 - Calc\n4 - GDC\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        if (gameNumber != 0) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.nameSetting();

            switch (gameNumber) {
                case 2 -> {
                    Even even = new Even();
                    even.playTheGame();
                }
                case 3 -> {
                    Calc calc = new Calc();
                    calc.playTheGame();
                }
                case 4 -> {
                    GDC gdc = new GDC();
                    gdc.playTheGame();
                }
                case 5 -> {
                    Progression progression = new Progression();
                    progression.playTheGame();
                }
                case 6 -> {
                    Prime prime = new Prime();
                    prime.playTheGame();
                }
                default -> {
                }
            }
        }
    }
}
