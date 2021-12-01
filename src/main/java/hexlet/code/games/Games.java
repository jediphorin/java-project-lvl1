package hexlet.code.games;

import hexlet.code.Cli;

public class Games {

    static final int CYCLES = 3;

    static void fail() {
        System.out.println("\nLet's try again, " + Cli.getName() + "!");
        System.exit(0);
    }
}
