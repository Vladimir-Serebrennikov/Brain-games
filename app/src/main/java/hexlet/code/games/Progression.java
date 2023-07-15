package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    public static void findProgression() {
        String question = "What number is missing in the progression?";
        Engine.gameStructure("Progression", question);
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
