package baseball.service;

import baseball.model.BaseBall;
import baseball.model.ComputerNumber;
import baseball.model.UserNumber;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;

public class BaseBallService {

    public static BaseBall inngin(UserNumber userNumber, ComputerNumber computerNumber) {
        return playInngin(userNumber, computerNumber);
    }

    private static BaseBall playInngin(UserNumber userNumber, ComputerNumber computerNumber) {
        int ball = getBall(userNumber.getNumbers(), computerNumber.getRandomNumbers());
        int strike = getStrike(userNumber.getNumbers(), computerNumber.getRandomNumbers());
        return createBaseBall(ball, strike);
    }

    private static int getBall(List<Integer> userNumbers, List<Integer> computerNumbers) {
        Set<Integer> userNumberSet = new HashSet<>(userNumbers);
        Set<Integer> computerSet = new HashSet<>(computerNumbers);
        userNumberSet.retainAll(computerSet);
        return userNumberSet.size();
    }

    private static int getStrike(List<Integer> userNumbers, List<Integer> computerNumbers) {
        return (int) IntStream.range(0, Math.min(userNumbers.size(), computerNumbers.size()))
                .filter(i -> Objects.equals(userNumbers.get(i), computerNumbers.get(i)))
                .count();
    }

    private static BaseBall createBaseBall(int ball, int strike) {
        return new BaseBall(ball - strike, strike);
    }
}

