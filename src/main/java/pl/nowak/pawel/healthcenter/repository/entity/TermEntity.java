package pl.nowak.pawel.healthcenter.repository.entity;

import java.time.LocalDateTime;

public class TermEntity {
    private Long id;
    private ReservationEntity reservation;
    private LocalDateTime date;
    private VisitEntity visit;
}
