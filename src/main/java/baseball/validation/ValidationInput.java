package baseball.validation;

public class ValidationInput {

    private final static String NOT_LENGTH = "NOT_LENGTH";
    private final static String NOT_INT = "NOT_LENGTH";
    private final static int INPUT_LENGTH = 3;

    public static int validateInputTypeRange(String inputContent) {

        if (inputContent.length() != INPUT_LENGTH) {
            throw new IllegalArgumentException(NOT_LENGTH);
        } try {
            return Integer.parseInt(inputContent);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NOT_INT);
        }
    }

    public static int validateInputType(String inputContent) {
        try {
            return Integer.parseInt(inputContent);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NOT_INT);
        }
    }
}
