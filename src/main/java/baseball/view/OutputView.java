package baseball.view;

public class OutputView {
    private static final String GAMEOVER_PROMPT = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";


    public void printHint(String hint) {
        System.out.println(hint);
    }

    public void printGameOver() {
        System.out.println(GAMEOVER_PROMPT);
    }
}
