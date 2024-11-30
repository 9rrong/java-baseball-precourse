package baseball.controller;

import baseball.model.Hint;
import baseball.model.Numbers;
import baseball.model.RandomNumbersGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

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
        List<Integer> computerNumbers = getRandomNumbers();

        while(true){
            Numbers playerNumbers = getNumbers();

            Hint hint = playerNumbers.compareWith(computerNumbers);
            outputView.printHint(hint.toString());
        }
    }


    private Numbers getNumbers() {
        return Numbers.valueOf(inputView.getInput());
    }

    private List<Integer> getRandomNumbers() {
        return randomNumbersGenerator.getRandomNumbers();
    }
}
