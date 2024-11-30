package baseball.model;

import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    public static final int NUMBERS_LENGTH = 3;
    public static final int NUMBER_MIN_VALUE = 1;
    public static final int NUMBER_MAX_VALUE = 9;

    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Numbers valueOf(String numberString) {
        validateNumberString(numberString);

        try {
            return new Numbers(numberString.chars()
                    .map(c -> c - '0')
                    .boxed()
                    .collect(Collectors.toList()));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void validateNumberString(String numberString) {
        validateBlank(numberString);
        validateLength(numberString);
        validateChar(numberString);
    }

    private static void validateBlank(String numberString) {
        if (numberString == null || numberString.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateLength(String numberString) {
        if (numberString.length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateChar(String numberString) {
        if (!numberString.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException();
        }
    }
}
