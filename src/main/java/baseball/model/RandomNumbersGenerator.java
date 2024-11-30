package baseball.model;

import static baseball.model.Numbers.NUMBERS_LENGTH;
import static baseball.model.Numbers.NUMBER_MAX_VALUE;
import static baseball.model.Numbers.NUMBER_MIN_VALUE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomNumbersGenerator {

    public List<Integer> getRandomNumbers() {
        return Randoms.pickUniqueNumbersInRange(NUMBER_MIN_VALUE, NUMBER_MAX_VALUE, NUMBERS_LENGTH);
    }
}
