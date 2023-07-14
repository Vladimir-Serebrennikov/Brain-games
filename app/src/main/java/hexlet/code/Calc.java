package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        int count = 0;
        while (count < 3) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int operation = random.nextInt(3);

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
            String userInput = scanner.nextLine();
            boolean isResult = result == userAnswer;
            if (!isResult) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result +
                        "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            } else if (isResult) {
                System.out.println("Correct!");
                count++;
            } else if (scanner.hasNextLine()){

                System.out.println("'" + userInput + "'" + " is wrong answer ;(. Correct answer was " + "'" + result +
                        "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");


    }
}


