package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calc {
    private static final int LOWER_BORDER = 2;
    private static final int UPPER_BORDER = 50;
    private static final String[] CALCULATOR_OPERATORS = new String[]{"+", "-", "*"};
    private static final String CALCULATOR_RULE = "What is the result of the expression?";

    public static void startGame() {

        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][Engine.ROUND_COUNT - 1];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int firstNumber = RandomUtils.generateRandomNumber(LOWER_BORDER, UPPER_BORDER);
            int secondNumber = RandomUtils.generateRandomNumber(LOWER_BORDER, UPPER_BORDER);
            int chosenOperator = RandomUtils.generateRandomNumber(0, CALCULATOR_OPERATORS.length - 1);
            String currentOperator = CALCULATOR_OPERATORS[chosenOperator];

            questionsAndAnswers[i][0] = firstNumber + " " + currentOperator + " " + secondNumber;
            questionsAndAnswers[i][1] = String.valueOf(calculate(currentOperator, firstNumber, secondNumber));
        }
        Engine.runGame(CALCULATOR_RULE, questionsAndAnswers);
    }

    public static int calculate(String operator, int firstNumber, int secondNumber) {
        int result = 0;
        switch (operator) {
            case "+" -> {
                return firstNumber + secondNumber;
            }
            case "-" -> {
                return firstNumber - secondNumber;
            }
            case "*" -> {
                return firstNumber * secondNumber;
            }
            default -> {
                throw new NullPointerException("Unknown operator: " + operator);
            }
        }
    }
}
