package pl.nowak.pawel.healthcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.nowak.pawel.healthcenter.repository.entity.VisitEntity;

@Repository //just for info
public interface VisitRepository extends JpaRepository<VisitEntity, Long> {
}
