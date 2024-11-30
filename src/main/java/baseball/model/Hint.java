package baseball.model;

public class Hint {
    private static final String BALL_SUFFIX = "볼 ";
    private static final String STRIKE_SUFFIX = "스트라이크";
    private static final String NO_MATCH_PROMPT = "낫싱";

    private final int ball;
    private final int strike;

    public Hint(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (ball > 0) {
            sb.append(ball)
                    .append(BALL_SUFFIX);
        }

        if (strike > 0) {
            sb.append(strike)
                    .append(STRIKE_SUFFIX);
        }

        if (strike == 0 && ball == 0) {
            sb.append(NO_MATCH_PROMPT);
        }

        return sb.toString();
    }
}
