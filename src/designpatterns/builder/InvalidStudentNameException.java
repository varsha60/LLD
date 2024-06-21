package designpatterns.builder;

public class InvalidStudentNameException extends RuntimeException {

    public InvalidStudentNameException() {
    }

    public InvalidStudentNameException(String message) {
        super(message);
    }

    public InvalidStudentNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidStudentNameException(Throwable cause) {
        super(cause);
    }

    public InvalidStudentNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
