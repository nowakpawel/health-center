package pl.nowak.pawel.healthcenter.core.exception;

public class TermNotFoundException extends HealthCenterException {
    public TermNotFoundException(String message) {
        super(message);
    }

    public TermNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
