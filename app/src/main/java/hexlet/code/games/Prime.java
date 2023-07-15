package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void primeChek() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.gameStructure("Prime", question);
    }
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
