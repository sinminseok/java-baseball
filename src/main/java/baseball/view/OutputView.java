package baseball.view;

public class OutputView {

    private final static String GAME_RESET_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
            "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void showResult(String message) {
        System.out.println(message);
    }

    public static void showResetGame(){
        System.out.println(GAME_RESET_MESSAGE);
    }

}
