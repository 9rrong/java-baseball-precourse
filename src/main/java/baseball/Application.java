package baseball;

import baseball.controller.BaseballGameController;
import baseball.model.RandomNumbersGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RandomNumbersGenerator randomNumbersGenerator = new RandomNumbersGenerator();

        BaseballGameController baseballGameController = new BaseballGameController(inputView, outputView,
                randomNumbersGenerator);

        baseballGameController.run();
    }
}
