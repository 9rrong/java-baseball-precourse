package baseball.controller;

import baseball.model.Numbers;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {
    private InputView inputView;
    private OutputView outputView;

    public void run() {
        Numbers playerNumbers = getNumbers();
        Numbers computerNumbers = getRandomNumbers();
    }

    private Numbers getNumbers(){
        return Numbers.valueOf(inputView.getInput());
    }
}
