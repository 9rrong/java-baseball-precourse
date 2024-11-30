package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HintTest {

    @ParameterizedTest
    @CsvSource(value = {"1,1,1볼 1스트라이크", "0,1,1스트라이크", "1,0,1볼", "0,0,낫싱"})
    void 문자열_반환_테스트(int ball, int strike, String expected) {
        Hint hint = new Hint(ball, strike);
        assertThat(hint.toString()).contains(expected);
    }
}