package pl.nowak.pawel.healthcenter.core.exception;

public class SpecializationNotFoundException extends HealthCenterException{
    public SpecializationNotFoundException(String message) {
        super(message);
    }

    public SpecializationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
