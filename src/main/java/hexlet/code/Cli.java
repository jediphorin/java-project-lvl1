package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String localName = scanner.nextLine();
        System.out.println("Hello, " + localName + "!");
        return localName;
    }
}
