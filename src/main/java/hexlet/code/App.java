package hexlet.code;

import hexlet.code.games.Even;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();
        if (gameNumber != 0 ) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.nameSetting();
            if (gameNumber == 2) {
                Even.evenNumber();
            }
        }
    }


}
