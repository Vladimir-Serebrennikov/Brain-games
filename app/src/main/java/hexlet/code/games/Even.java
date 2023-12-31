package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {
    public static final int DEFAULT_LOWER_BORDER = 0;
    public static final int DEFAULT_UPPER_BORDER = 100;
    public static final String EVEN_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        String[][] questionAnswerPairs = new String[Engine.ROUND_COUNT][];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            questionAnswerPairs[i] = questionAndAnswerPair();
        }
        Engine.runGame(EVEN_RULE, questionAnswerPairs);
    }

    public static String[] questionAndAnswerPair() {
        String[] questionAnswerPair = new String[2];

        questionAnswerPair[0] = String.valueOf(RandomUtils.generateRandomNumber(DEFAULT_LOWER_BORDER,
                DEFAULT_UPPER_BORDER));
        questionAnswerPair[1] = isEvenNumber(Integer.parseInt(questionAnswerPair[0])) ? "yes" : "no";
        return questionAnswerPair;
    }

    public static boolean isEvenNumber(int inputNumber) {
        return inputNumber % 2 == 0;
    }
}
