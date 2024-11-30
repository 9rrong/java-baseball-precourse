package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String NUMBER_INPUT_PROMPT = "숫자를 입력해주세요 : ";
    private static final String RESTART_PROMPT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";



    public String getInput() {
        System.out.print(NUMBER_INPUT_PROMPT);
        return Console.readLine();
    }

    public String getRestart() {
        System.out.println(RESTART_PROMPT);
        return Console.readLine();
    }
}
