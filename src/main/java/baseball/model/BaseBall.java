package baseball.model;

import java.util.List;
import java.util.stream.IntStream;

public class BaseBall {
    private static final String THREE_STRIKE = "3스트라이크";
    private static final String NOTHING = "낫싱";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";


    private int ball;
    private int strike;


    public BaseBall(int ball,int strike) {
        this.strike = strike;
        this.ball = ball;
    }

    public String checkresult() {
        if (strike == 3) {
            return THREE_STRIKE;
        }
        if (ball == 0 && strike == 0) {
            return NOTHING;
        }
        if (ball != 0 && strike == 0) {
            return ball + BALL;
        }
        if (ball == 0 && strike != 0) {
            return strike + STRIKE;
        }
        return ball + BALL + strike + STRIKE;
    }

}
