package hexlet.code;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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

        int count = 0;
        int rounds = 3;
        int interval = 100;
        while (count < rounds) {
            if (gameName.equals("Even")) {
                int number = random.nextInt(interval);
                System.out.println("Question: " + number);
                String answer = scanner.nextLine();
                System.out.println("Your answer: " + answer);
                boolean isEven = (number % 2 == 0);
                if (isEven && answer.equals("no") || (!isEven && answer.equals("yes"))) {
                    System.out.println("'yes' is wrong answer ;)."
                            + " Correct answer was 'no'. Let's try again, " + name + "!");
                    return;
                } else if (isEven && answer.equals("yes") || (!isEven && answer.equals("no"))) {
                    System.out.println("Correct!");
                    count++;
                } else if (!answer.equals("yes") || !answer.equals("no")) {
                    System.out.println("'yes' is wrong answer ;)."
                            + " Correct answer was 'no'. Let's try again, " + name + "!");
                    return;
                }
            } else if (gameName.equals("Calc")) {
                int number1 = random.nextInt(interval);
                int number2 = random.nextInt(interval);
                int expressions = 3;
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
                    return;
                } else if (isResult) {
                    System.out.println("Correct!");
                    count++;
                }
            } else if (gameName.equals("GSD")) {
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
                    return;
                } else if (isResult) {
                    System.out.println("Correct!");
                    count++;
                }
            } else if (gameName.equals("Progression")) {
                int[] progression = Progression.generateProgression();
                int hiddenIndex = Progression.hideNumber(progression);
                System.out.print("Question: ");
                for (int i = 0; i < progression.length; i++) {
                    if (i == hiddenIndex) {
                        System.out.print(".. ");
                    } else {
                        System.out.print(progression[i] + " ");
                    }

                }
                System.out.print("\nYour answer: ");
                int userAnswer = scanner.nextInt();
                if (userAnswer == progression[hiddenIndex]) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(."
                            + " Correct answer was '" + progression[hiddenIndex] + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            } else if (gameName.equals("Prime")) {
                int number = random.nextInt(interval);
                System.out.println("Question: " + number);
                String answer = scanner.nextLine();
                System.out.println("Your answer: " + answer);
                boolean isPrime = Prime.isPrimeNumber(number);

                if (isPrime && answer.equals("no") || !isPrime && answer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;)."
                            + " Correct answer was 'no'. Let's try again, " + name + "!");
                    return;
                } else if (isPrime && answer.equals("yes") || !isPrime && answer.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else if (!answer.equals("yes") || !answer.equals("no")) {
                    System.out.println("'yes' is wrong answer ;)."
                            + " Correct answer was 'no'. Let's try again, " + name + "!");
                    return;
                }


            }


        }
        System.out.println("Congratulations, " + name + "!");


    }
}
