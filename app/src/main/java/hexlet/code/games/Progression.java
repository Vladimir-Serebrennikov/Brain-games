package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Progression {

    static final int STEP_MAX_VALUE = 10;
    static final int STEP_MIN_VALUE = 1;
    static final int FIRST_ELEMENT_MAX_VALUE = 50;
    static final int FIRST_ELEMENT_MIN_VALUE = 5;
    static final int MIN_PROGRESSION_SIZE = 5;
    static final int MAX_PROGRESSION_SIZE = 10;
    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void startGame() {


        int progressionSize = RandomUtils.generateRandomNumber(MIN_PROGRESSION_SIZE, MAX_PROGRESSION_SIZE
        );

        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][Engine.ROUND_COUNT - 1];


        for (int i = 0; i < Engine.ROUND_COUNT; i++) {

            int first = RandomUtils.generateRandomNumber(FIRST_ELEMENT_MIN_VALUE, FIRST_ELEMENT_MAX_VALUE);
            int step = RandomUtils.generateRandomNumber(STEP_MIN_VALUE, STEP_MAX_VALUE);
            int hiddenMemberIndex = RandomUtils.generateRandomNumber(0, progressionSize - 1);

            int[] progression = makeProgression(first, progressionSize, step);
            String[] stringProgression = new String[progression.length];
            for (int j = 0; j < progression.length; j++) {
                stringProgression[j] = String.valueOf(progression[j]);
            }
            
            String answer = stringProgression[hiddenMemberIndex];
            questionsAndAnswers[i][1] = answer;
            stringProgression[hiddenMemberIndex] = "..";
            String question = String.join(" ", stringProgression);
            questionsAndAnswers[i][0] = question;

        }
        Engine.runGame(DESCRIPTION, questionsAndAnswers);
    }

    public static int[] makeProgression(int startElement, int progressionSize, int progressionStep) {
        int[] array = new int[progressionSize];
        for (int i = 0; i < progressionSize; i++) {
            array[i] = startElement;
            startElement += progressionStep;
        }
        return array;
    }
}
