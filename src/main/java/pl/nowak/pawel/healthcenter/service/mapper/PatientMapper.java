package pl.nowak.pawel.healthcenter.service.mapper;

import org.springframework.stereotype.Component;
import pl.nowak.pawel.healthcenter.repository.entity.PatientEntity;
import pl.nowak.pawel.healthcenter.web.model.PatientModel;

@Component
public class PatientMapper {
    public PatientEntity from(PatientModel patientModel) {
        return null;
    }

    public PatientModel from(PatientEntity patientEntity) {
        return null;
    }
}
