package hexlet.code;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GDC\n0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();
        Engine engine = new Engine(gameNumber);
        engine.executeTheGame();
    }


}
