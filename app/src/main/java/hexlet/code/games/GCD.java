package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    private Scanner scanner;
    private Random random;
    private String name;

    public GCD (Scanner scanner, String name) {
        this.scanner = scanner;
        random = new Random();
        this.name = name;
    }

    public boolean startGame(int interval) {
        int count = 0;
        final int rounds = 3;
        while (count < rounds) {
            int number1 = random.nextInt(interval);
            int number2 = random.nextInt(interval);
            int result = GCD.findGSD(number1, number2);
            System.out.println("Question: " + number1 + " " + number2);
            System.out.println("Your answer: ");
            int userAnswer = scanner.nextInt();
            boolean isResult = result == userAnswer;
            if (!isResult) {
                    System.out.println("'" + userAnswer + "'" + " is wrong answer ;(."
                            + " Correct answer was " + "'" + result + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return false;
                } else if (isResult) {
                    System.out.println("Correct!");
                    count++;
                }
        }
        return true;
    }
    public static int findGSD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGSD(b, a % b);
        }
    }
   }

