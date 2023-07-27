package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
public class Prime {

    private Scanner scanner;
    private Random random;
    private String name;

    public Prime (Scanner scanner, String name) {
        this.scanner = scanner;
        random = new Random();
        this.name = name;
    }
    public boolean startGame(int interval) {
        int count = 0;
        final int rounds = 3;
        while (count < rounds) {
            int number = random.nextInt(interval);
            System.out.println("Question: " + number);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            boolean isPrime = Prime.isPrimeNumber(number);

            if (isPrime && answer.equals("no") || !isPrime && answer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;)."
                            + " Correct answer was 'no'. Let's try again, " + name + "!");
                    return false;
                } else if (isPrime && answer.equals("yes") || !isPrime && answer.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else if (!answer.equals("yes") || !answer.equals("no")) {
                    System.out.println("'yes' is wrong answer ;)."
                            + " Correct answer was 'no'. Let's try again, " + name + "!");
                    return false;
                }
        }
        return true;
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
