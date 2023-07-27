package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int caseThree = 3;
        final int caseFour = 4;
        final int caseFive = 5;
        final int caseSix = 6;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);


        switch (choice) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                System.out.println("May I have your name?");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Hello, " + name + "!");
                break;
            case 2:
                Engine.gameStructure("Even", "Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case caseThree:
                Engine.gameStructure("Calc", "What is the result of the expression?");
                break;
            case caseFour:
                Engine.gameStructure("GCD", "Find the greatest common divisor of given numbers.");
                break;
            case caseFive:
                Engine.gameStructure("Progression", "What number is missing in the progression?");
                break;
            case caseSix:
                Engine.gameStructure("Prime", "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            default:
                break;
        }
        scanner.close();

    }
}
