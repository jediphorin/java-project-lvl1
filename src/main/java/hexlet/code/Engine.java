package hexlet.code;

import hexlet.code.games.*;

public class Engine {
    private int gameNumber;

    public Engine(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public void executeTheGame() {
        if (gameNumber != 0 ) {
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
        }
    }
}
