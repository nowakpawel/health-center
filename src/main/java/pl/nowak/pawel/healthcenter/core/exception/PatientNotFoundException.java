package pl.nowak.pawel.healthcenter.core.exception;

public class PatientNotFoundException extends HealthCenterException {
    public PatientNotFoundException(String message) {
        super(message);
    }

    public PatientNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
