package ch11.exercise.p7;

public class NoExistIDException extends Exception {
    public NoExistIDException() {
    }

    public NoExistIDException(String message) {
        super(message);
    }
}
