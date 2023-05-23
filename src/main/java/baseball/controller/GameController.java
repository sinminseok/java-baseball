package baseball.controller;

import baseball.model.BaseBall;
import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.service.BaseBallService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

    private static final String THREE_STRIKE = "3스트라이크";
    private static final int RESTART_GAME = 1;
    private static boolean inning_state = true;

    public static void run() {
        ComputerNumber computerNumbers = createComputerNumbers();
        while (inning_state) {
            checkResult(BaseBallService.inngin(createUserNumbers(), computerNumbers));
        }
        checkResetGame(resetGame());

    }

    private static void checkResult(BaseBall ball) {
        OutputView.showResult(ball.checkresult());
        if (ball.checkresult() == THREE_STRIKE) {
            inning_state = false;
        }
    }

    private static UserNumber createUserNumbers() {
        return new UserNumber(InputView.inputNumber());
    }


    private static ComputerNumber createComputerNumbers() {
        return new ComputerNumber();
    }

    private static int resetGame() {
        OutputView.showResetGame();
        return InputView.resetGame();
    }

    private static void checkResetGame(int resetGame) {
        if (resetGame == RESTART_GAME) {
            inning_state = true;
            run();
        }
    }
}
