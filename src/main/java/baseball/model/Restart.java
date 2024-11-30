package baseball.model;

import java.util.Arrays;

public enum Restart {
    ACCEPT("1", true),
    DENY("2", false);

    private final String input;
    private final boolean restart;

    Restart(String input, boolean restart) {
        this.input = input;
        this.restart = restart;
    }

    public static Restart fromInput(String input) {
        return Arrays.stream(values())
                .filter(restart -> restart.input.equals(input))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public boolean isRestart() {
        return restart;
    }
}