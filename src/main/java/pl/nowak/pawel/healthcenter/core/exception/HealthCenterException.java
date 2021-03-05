package pl.nowak.pawel.healthcenter.core.exception;

public class HealthCenterException extends Exception {
    public HealthCenterException(String message) {
        super(message);
    }

    public HealthCenterException(String message, Throwable cause) {
        super(message, cause);
    }
}
