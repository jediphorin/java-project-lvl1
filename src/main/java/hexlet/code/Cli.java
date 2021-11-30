package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Cli.name = name;
    }

    public static void nameSetting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String localName = scanner.nextLine();
        System.out.println("Hello, " + localName);
        setName(localName);
    }
}
