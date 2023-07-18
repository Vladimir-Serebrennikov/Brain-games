package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static int findGSD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGSD(b, a % b);
        }
    }

    public static void findGSD() {
        String question = "Find the greatest common divisor of given numbers.";
        Engine.gameStructure("GSD", question);
    }
}
