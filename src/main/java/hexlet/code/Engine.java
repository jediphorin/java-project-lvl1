package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {

    public static Scanner scanner = new Scanner(System.in);

//    public Engine(int gameNumber) {
//        this.gameNumber = gameNumber;
//    }

    public Engine() {
    }

    public void executeTheGame() {

        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GDC\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        if (gameNumber != 0) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.nameSetting();

            switch (gameNumber) {
                case 2:
                    Even.evenNumber();
                    break;
                case 3:
                    Calc calc = new Calc();
                    calc.calculatorTheGame();
                    break;
                case 4:
                    GDC gdc = new GDC();
                    gdc.GDCTheGame();
                    break;
                case 5:
                    Progression progression = new Progression();
                    break;
                case 6:
                    Prime prime = new Prime();
                    prime.primeTheGame();
                    break;
                default:
            }
        }

        /*if (gameNumber != 0 ) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.nameSetting();
            if (gameNumber == 2) {
                Even.evenNumber();
            } else if (gameNumber == 3) {
                Calc calc = new Calc();
                calc.calculatorTheGame();
            } else if (gameNumber == 4) {
                GDC gdc = new GDC();
                gdc.GDCTheGame();
            } else if (gameNumber == 5) {
                Progression progression = new Progression();
            } else if (gameNumber == 6) {
                Prime prime = new Prime();
                prime.primeTheGame();
            }
        }*/
    }
}
