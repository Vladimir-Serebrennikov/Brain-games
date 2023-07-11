package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void parityCheck() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


        int count = 0;

        while (count < 3) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            boolean isEven = (number % 2 == 0);
            if (isEven && answer.equals("no") || (!isEven && answer.equals("yes"))) {
                System.out.println("'yes' is wrong answer ;). Correct answer was 'no'. Let's try again, " + name + "!");
                return;
            } else if (isEven && answer.equals("yes") || (!isEven && answer.equals("no"))) {
                System.out.println("Correct!");
                count++;
            } else if (!answer.equals("yes") || !answer.equals("no")) {
                System.out.println("'yes' is wrong answer ;). Correct answer was 'no'. Let's try again, " + name + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + name + "!");

    }


}
