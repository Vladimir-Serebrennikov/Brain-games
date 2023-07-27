package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class Calc {
    private Scanner scanner;
    private Random random;
    private String name;

    public Calc (Scanner scanner, String name) {
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
            final int expressions = 3;
            int operation = random.nextInt(expressions);

            char operator;
            int result;
            switch (operation) {
                    case 0:
                        operator = '+';
                        result = number1 + number2;
                        break;
                    case 1:
                        operator = '-';
                        result = number1 - number2;
                        break;
                    case 2:
                        operator = '*';
                        result = number1 * number2;
                        break;
                    default:
                        operator = '+';
                        result = number1 + number2;
                        break;
                }
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
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

}


