package pl.nowak.pawel.healthcenter.core.exception;

public class DoctorNotFoundException extends HealthCenterException {
    public DoctorNotFoundException(String message) {
        super(message);
    }

    public DoctorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
