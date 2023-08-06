package hexlet.code;
import java.util.Random;

public class RandomUtils {

    public static int generateRandomNumber(int lowerBorder, int upperBorder) {
        return (int) (Math.random() * (upperBorder - lowerBorder + 1) + lowerBorder);
    }
}
