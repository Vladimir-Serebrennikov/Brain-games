package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static void gameStructure(String gameName, String question) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);


        if (gameName.equals("Even")) {
            Even even = new Even(scanner, name);
            if (!even.startGame(100)) return;
        } else if (gameName.equals("Calc")) {
            Calc calc = new Calc(scanner, name);
            if (!calc.startGame(100)) return;
        } else if (gameName.equals("GCD")) {
            GCD gsd = new GCD(scanner, name);
            if (!gsd.startGame(100)) return;
        } else if (gameName.equals("Prime")) {
            Prime prime = new Prime(scanner, name);
            if (!prime.startGame(100)) return;
        } else if (gameName.equals("Progression")) {
            Progression progression = new Progression(scanner, name);
            if (!progression.startGame(100)) return;
        }

        System.out.println("Congratulations, " + name + "!");


    }
}
