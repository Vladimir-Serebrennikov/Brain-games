package hexlet.code.games;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {

        int[] progression = generateProgression();
        int hiddenIndex = hideNumber(progression);

        System.out.print("Question: ");
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                System.out.print(".. ");
            } else {
                System.out.print(progression[i] + " ");
            }
            
        }

        System.out.print("\nYour answer: ");

        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        if (userAnswer == progression[hiddenIndex]) {
            System.out.println("Congratulations! Your answer is correct!");
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + progression[hiddenIndex] + "'.");
            System.out.println("Let's try again!");
        }
    }

    public static int[] generateProgression() {
        Random random = new Random();
        int length = random.nextInt(6) + 5;
        int[] progression = new int[length];
        int start = random.nextInt(20);
        int step = random.nextInt(5) + 1;

        for (int i = 0; i < length; i++) {
            progression[i] = start + (i * step);
        }

        return progression;
    }

    public static int hideNumber(int[] progression) {
        Random random = new Random();
        int hiddenIndex = random.nextInt(progression.length);
        return hiddenIndex;
    }


}
