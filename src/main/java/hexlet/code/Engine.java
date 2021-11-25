package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

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
            }
        }
    }
}
