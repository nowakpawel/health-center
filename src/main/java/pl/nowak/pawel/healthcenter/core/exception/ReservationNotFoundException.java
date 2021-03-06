package pl.nowak.pawel.healthcenter.core.exception;

public class ReservationNotFoundException extends HealthCenterException {
    public ReservationNotFoundException(String message) {
        super(message);
    }

    public ReservationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
