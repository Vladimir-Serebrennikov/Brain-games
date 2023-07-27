package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    private Scanner scanner;
    private Random random;
    private String name;

    public Progression (Scanner scanner, String name) {
        this.scanner = scanner;
        random = new Random();
        this.name = name;
    }
    public boolean startGame(int interval) {
        int count = 0;
        final int rounds = 3;
        while (count < rounds) {
            int[] progression = Progression.generateProgression(10, 5, 2);
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
                    return false;
            }
               }
        return true;

                }

    public static int[] generateProgression(int progressionLength, int step, int firstNumber) {
        int[] progression = new int[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progression[i] = firstNumber + (i * step);
        }
        return progression;
    }
    

    public static int hideNumber(int[] progression) {
        Random random = new Random();
        int hiddenIndex = random.nextInt(progression.length);
        return hiddenIndex;
    }


}
