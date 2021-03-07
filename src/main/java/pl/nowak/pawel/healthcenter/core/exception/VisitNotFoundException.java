package pl.nowak.pawel.healthcenter.core.exception;

public class VisitNotFoundException extends HealthCenterException {
    public VisitNotFoundException(String message) {
        super(message);
    }

    public VisitNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
