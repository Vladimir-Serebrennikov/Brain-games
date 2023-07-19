package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    public static void findProgression() {
        String question = "What number is missing in the progression?";
        Engine.gameStructure("Progression", question);
    }


    public static int[] generateProgression() {
        Random random = new Random();
        int minimumProgressionLength = 6;
        int maximumProgressionLength = 5;
        int length = random.nextInt(minimumProgressionLength) + maximumProgressionLength;
        int[] progression = new int[length];
        int seedInterval = 20;
        int start = random.nextInt(seedInterval);
        int randomStep = 5;
        int step = random.nextInt(randomStep) + 1;

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
