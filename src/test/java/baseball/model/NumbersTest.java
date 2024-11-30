package baseball.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


class NumbersTest {

    @ParameterizedTest
    @ValueSource(strings = {"aaa", "aa", "aaaa"})
    void 숫자가_아닌_문자_입력_예외_테스트(String input) {
        assertThatThrownBy(() -> Numbers.valueOf(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234", "12", "1"})
    void 숫자_입력_예외_테스트(String input) {
        assertThatThrownBy(() -> Numbers.valueOf(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 공백_빈값_입력_예외_테스트(String input) {
        assertThatThrownBy(() -> Numbers.valueOf(input)).isInstanceOf(IllegalArgumentException.class);
    }

}