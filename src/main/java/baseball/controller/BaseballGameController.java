package baseball.controller;

import baseball.model.Numbers;
import baseball.model.RandomNumbersGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RandomNumbersGenerator randomNumbersGenerator;

    public BaseballGameController(InputView inputView, OutputView outputView,
                                  RandomNumbersGenerator randomNumbersGenerator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.randomNumbersGenerator = randomNumbersGenerator;
    }

    public void run() {
        Numbers playerNumbers = getNumbers();
        Numbers computerNumbers = getRandomNumbers();
    }

    private Numbers getNumbers() {
        return Numbers.valueOf(inputView.getInput());
    }

    private Numbers getRandomNumbers() {
        return new Numbers(randomNumbersGenerator.getRandomNumbers());
    }
}
