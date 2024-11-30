package baseball.controller;

import baseball.model.Hint;
import baseball.model.Numbers;
import baseball.model.RandomNumbersGenerator;
import baseball.model.Restart;
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
        while (true) {
            List<Integer> computerNumbers = getRandomNumbers();

            while (true) {
                Numbers playerNumbers = getNumbers();

                Hint hint = playerNumbers.compareWith(computerNumbers);
                outputView.printHint(hint.toString());

                if (hint.isThreeStrike()) {
                    break;
                }
            }

            outputView.printGameOver();

            if (!Restart.fromInput(inputView.getRestart()).isRestart()) {
                break;
            }
        }
    }

    private Numbers getNumbers() {
        return Numbers.valueOf(inputView.getInput());
    }

    private List<Integer> getRandomNumbers() {
        return randomNumbersGenerator.getRandomNumbers();
    }
}
