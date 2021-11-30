package hexlet.code.games;

import hexlet.code.Cli;

public abstract class Games {

    public static final int CYCLES = 3;

    public abstract void playTheGame();

    protected static final void fail() {
        System.out.println("\nLet's try again, " + Cli.getName() + "!");
        System.exit(0);
    }
}
