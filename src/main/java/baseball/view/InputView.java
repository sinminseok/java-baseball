package baseball.view;

import baseball.validation.ValidationInput;
import camp.nextstep.edu.missionutils.Console;


public class InputView {
    private static final String INPUT_NUMBER = "숫자를 입력해주세요 : ";
    private static final String INPUT_INT = "숫자를 입력해주세요";
    private static final String NOT_LENGTH = "NOT_LENGTH";
    private static final String NOT_INT = "NOT_INT";
    private static final String INPUST_THREE_NUMBER = "3자리 숫자를 입력해주세요";


    public static int inputNumber() {
        try {
            System.out.println(INPUT_NUMBER);
            return ValidationInput.validateInputTypeRange(Console.readLine());
        } catch (IllegalArgumentException e) {
            if (e.getMessage() == NOT_LENGTH) {
                System.out.println(INPUST_THREE_NUMBER);
            }
            if (e.getMessage() == NOT_INT) {
                System.out.println(INPUT_INT);
            }
            return inputNumber();
        }
    }

    public static int resetGame() {
        try {
            return ValidationInput.validateInputType(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return resetGame();
        }
    }


}
