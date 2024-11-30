package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String NUMBER_INPUT_PROMPT = "숫자를 입력해주세요 : ";


    public String getInput() {
        System.out.print(NUMBER_INPUT_PROMPT);
        return Console.readLine();
    }
}
