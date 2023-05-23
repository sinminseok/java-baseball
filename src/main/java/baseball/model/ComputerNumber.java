package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    private final static int MAX_LENGTH = 3;
    private final static int MIN_NUMBER_RANGE = 1;
    private final static int MAX_NUMBER_RANGE = 9;

    private final List<Integer> randomNumbers;

    public ComputerNumber(){
        this.randomNumbers = createNumbers();
    }


    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }

    private static List<Integer> createNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < MAX_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER_RANGE, MAX_NUMBER_RANGE);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}
