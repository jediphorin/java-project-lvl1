package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int UPPER_RANDOM_LIMIT = 99;
    public static final int LOWER_RANDOM_LIMIT = 1;

    public static int randomNumber(int upper, int lower) {
        Random random = new Random();
        return random.nextInt(upper - lower) + lower;
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt();
    }

    public static int randomNumber(int elements) {
        Random random = new Random();
        return random.nextInt(elements);
    }
}
