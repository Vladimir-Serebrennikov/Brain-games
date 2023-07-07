package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.println("Your choice: 1");

        int choice = scanner.nextInt();
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
        }
        scanner.close();

    }
}
