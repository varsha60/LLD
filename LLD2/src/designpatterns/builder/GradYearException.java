package designpatterns.builder;

public class GradYearException extends RuntimeException {

    public GradYearException() {
    }

    public GradYearException(String message) {
        super(message);
    }

    public GradYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradYearException(Throwable cause) {
        super(cause);
    }

    public GradYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
