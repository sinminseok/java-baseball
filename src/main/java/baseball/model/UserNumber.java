package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {
    private final List<Integer> numbers;

    public UserNumber(int numbers) {
        this.numbers = convertList(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private static List<Integer> convertList(int userNumber) {
        List<Integer> userNumberList = new ArrayList<>();
        int value = Math.abs(userNumber);
        while (value > 0) {
            int digit = value % 10;
            userNumberList.add(0, digit);
            value /= 10;
        }
        return userNumberList;
    }

}
