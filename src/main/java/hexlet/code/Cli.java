package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String name;
//    private String name;
//    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public static void nameSetting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String localName = scanner.nextLine();
        System.out.println("Hello, " + localName);
        Cli.name = localName;
    }
}
