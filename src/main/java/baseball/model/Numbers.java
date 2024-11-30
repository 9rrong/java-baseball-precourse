package baseball.model;

import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    private List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Numbers valueOf(String numberString) {
        return new Numbers(numberString.chars()
                .map(c -> c - '0')
                .boxed()
                .collect(Collectors.toList()));
    }
}
