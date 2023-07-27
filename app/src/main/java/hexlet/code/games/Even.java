package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class Even {

    private Scanner scanner;
    private Random random;
    private String name;

    public Even (Scanner scanner, String name) {
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
            boolean isEven = (number % 2 == 0);
            if (isEven && answer.equals("no") || (!isEven && answer.equals("yes"))) {
                System.out.println("'yes' is wrong answer ;)."
                        + " Correct answer was 'no'. Let's try again, " + name + "!");
                return false;
            } else if (isEven && answer.equals("yes") || (!isEven && answer.equals("no"))) {
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

}
