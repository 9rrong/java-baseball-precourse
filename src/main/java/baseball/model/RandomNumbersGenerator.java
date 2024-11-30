package baseball.model;

import static baseball.model.Numbers.NUMBERS_LENGTH;
import static baseball.model.Numbers.NUMBER_MAX_VALUE;
import static baseball.model.Numbers.NUMBER_MIN_VALUE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumbersGenerator {


    public List<Integer> getRandomNumbers() {
        return IntStream.range(0, NUMBERS_LENGTH)
                .mapToObj(i -> Randoms.pickNumberInRange(NUMBER_MIN_VALUE, NUMBER_MAX_VALUE))
                .collect(Collectors.toList());
    }
}
