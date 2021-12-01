package hexlet.code.games;

import hexlet.code.Cli;

public abstract class Games {

    static final int CYCLES = 3;

    abstract void playTheGame();

    protected static void fail() {
        System.out.println("\nLet's try again, " + Cli.getName() + "!");
        System.exit(0);
    }
}
